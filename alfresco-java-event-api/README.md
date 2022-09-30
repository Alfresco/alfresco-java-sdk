# Alfresco Java Event API

Alfresco Java Event API is a part of the Alfresco Java SDK that enables an Alfresco integrator to work with the new Alfresco Event API, reacting to the events 
produced by the Alfresco platform.

## Components

The Alfresco Java Event API offering is composed by four main components: the event model, the event handling library, the [Spring Integration](https://spring.io/projects/spring-integration) 
tooling library and the [Spring Boot](https://spring.io/projects/spring-boot) custom [starter](https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-developing-auto-configuration).

### Event Model

The event model is a component that offers a custom model definition to clearly specify the way the event's data is organised. 

This component is declared in the module [alfresco-java-event-api-model](./alfresco-java-event-api-model) and it is explained in detail in its 
[README file](./alfresco-java-event-api-model/README.md).

### Event Handling Library

The event handling library is a core component of the Java Event API that offers a set of pre-defined event handling interfaces and the classes required to 
properly work with them. The idea of this library is to ease the implementation of behaviours that must be triggered as a response to an event.

This component is defined in the module [alfresco-java-event-api-handling](./alfresco-java-event-api-handling). The classes and interfaces of this library 
where designed to be as Java technology agnostic as possible. They offer the plain event handling functionality doing no assumptions about the technology used
to make them work together. They're mostly plain Java classes, so the integrator can use them in a Spring project, a Dagger project or any other technology.

The main four items in this library are explained in the next sections.

#### Event Handler

[```EventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java) interface defines the 
contract of each implementation of a behaviour to be triggered as a reaction to an event.

This contract has been reduced to a minimum, which is:
* The type(s) of event(s) the handler will tackle.
* Other conditions the event must match to be handled (defaulted to none). See [Event Filter](#event-filter).
* The code to execute as a reaction to the event.

A hierarchy of interfaces that extend [```EventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java) 
has been already defined to cover the different types of events that can be currently triggered by the API (i.e. 
[```OnNodeDeletedEventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/OnNodeDeletedEventHandler.java)).

If you want to implement an [```EventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java) 
that implements more than one interface in the hierarchy you will need to provide an implementation of the method ```getHandledEventTypes``` to solve the 
conflict of default implementations of this method provided by each interface. It would be as easy as implementing the method returning a set with all the 
event types that your handler should handle.

```java
public class MyMultipleEventTypeHandler implements OnNodeCreatedEventHandler,OnNodeUpdatedEventHandler {
    ...
    @Override 
    public Set<EventType> getHandledEventTypes() {
        return Set.of(EventType.NODE_CREATED, EventType.NODE_UPDATED);
    }
    ...
}
```

#### Event Handling Registry

[```EventHandlingRegistry```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/EventHandlingRegistry.java) is a class that 
registers the [```EventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java)'s that must be 
executed in response to each event type.

#### Event Handling Executor

[```EventHandlingExecutor```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/EventHandlingExecutor.java) is an interface
that defines the process to execute the event handlers when events are received.

Currently, there is only one implementation ([```SimpleEventHandlingExecutor```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/SimpleEventHandlingExecutor.java))
of this interface that simply uses the [```EventHandlingRegistry```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/EventHandlingRegistry.java)
to get the list of [```EventHandler```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/handler/EventHandler.java)'s to execute
when a specific event is triggered and executes them synchronously one by one. 

#### Event Filter

[```EventFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/EventFilter.java) is an interface that defines the
contract that must be fulfilled by an event. It is basically a predicate interface that allows the integrator to easily define conditions that must match an
event.

The SDK offers a basic set of implementations of the [```EventFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/EventFilter.java)
covering the most common use cases that can be tackled by a handler (i.e. [```PropertyChangedFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/PropertyChangedFilter.java) 
or [```ContentAddedFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/ContentAddedFilter.java)).

The integrator can create new custom event filters, as complex as required, and can use the logical operation of the [```EventFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/EventFilter.java)
interface to combine several simpler filters in any way.

For instance, you can create a filter to react to an event related to the modification of the title of a content of type ```cm:content``` with a mime-type of 
```text/html``` this way:

```java
PropertyChangedFilter.of("cm:title")
    .and(NodeTypeFilter.of("cm:content"))
    .and(MimeTypeFilter.of("text/html"))
```

### Spring Integration Tooling Library

The Spring Integration tooling library component offers some utility classes that ease the handling of Alfresco events in the context of a Spring Integration 
application.  

This component is defined in the module [alfresco-java-event-api-integration](./alfresco-java-event-api-integration). 

It makes use of the event handling library and the event model to offer integration features making the assumption that the integrator is working on the context 
of a Spring Integration project. 

The way the events are consumed from the ActiveMQ topic where the Events API is currently publishing them is not specified at this level of integration, and it 
is intentionally left open to the integrator's choice. For a more opinionated integration level please take a look to the 
[Spring Boot custom starter section](#spring-boot-custom-starter).

Once the JSON events are ingested in a Spring Integration channel, this library offers a transformer to translate from the JSON schema defined by the Event Model
to the Java POJO classes defined in it (i.e. ```RepoEvent```).

Apart from that, this module offers a wrapper of the [```EventFilter```](./alfresco-java-event-api-handling/src/main/java/org/alfresco/event/sdk/handling/filter/EventFilter.java)
interface as a Spring Integration filter (```GenericSelector```) to be able to use all the filter offering of the handling library in a Spring Integration
context easily.

### Spring Boot Custom Starter

The Spring Boot custom starter component defines a personalized Spring Boot starter to automatically configure all the beans and properties defaults to 
implement a client of the Alfresco Java Event API easily. As should be expected, the use of this component makes the assumption of creating an integration in 
the context of a Spring Boot application.

This component is defined in the modules [alfresco-java-event-api-spring-boot-autoconfigure](./alfresco-java-event-api-spring-boot-autoconfigure) and 
[alfresco-java-event-api-spring-boot-starter](./alfresco-java-event-api-spring-boot-starter).

The core class of this module is [```AlfrescoEventsAutoConfiguration```](./alfresco-java-event-api-spring-boot-autoconfigure/src/main/java/org/alfresco/event/sdk/autoconfigure/AlfrescoEventsAutoConfiguration.java).
It is a Spring configuration class that automatically define the beans required to do the next actions:
* Define a Spring Integration flow to read the event messages from the ActiveMQ topic using a JMS channel adapter.
* Transform the message payload from JSON to a ```RepoEvent``` object. 
* Route the corresponding event messages to up to 2 other channels:
  + A channel to use pure Spring Integration handling if the property ```alfresco.events.enableSpringIntegration``` is enabled.
  + A channel to use event handling (from the event handling library) if the property ```alfresco.events.enableHandlers``` is enabled.

All this auto-configuration will be enabled as soon as the dependency ```org.alfresco:alfresco-java-event-api-spring-boot-starter``` is added to a Spring Boot 
project.

## How To Integrate

### Option 1: Use Spring Boot Starter

The steps to integrate with the Alfresco Java Event API using the Spring Boot starter are:

* In you ```pom.xml``` file, add the dependency of the custom starter:

```xml
    <dependency>
      <groupId>org.alfresco</groupId>
      <artifactId>alfresco-java-event-api-spring-boot-starter</artifactId>
      <version>5.1.5-SNAPSHOT</version>
    </dependency>
```

* In your ```application.properties``` file define the properties required to properly connect to the ActiveMQ broker:

```
spring.activemq.brokerUrl=tcp://activemq-host:61616
# This property is required if you want Spring Boot to auto-define the ActiveMQConnectionFactory, otherwise you can define that bean in Spring config
spring.jms.cache.enabled=false
```

Additional integration properties can be found [here](https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html#common-application-properties-integration).

* In your ```application.properties``` file define the properties to set the type of integration you want to use (spring integration and/or plain Java 
handlers):

```
alfresco.events.enableSpringIntegration=false
alfresco.events.enableHandlers=true
```

From this point you can start defining Spring Integration flows and/or event handlers depending on the integration method selected.

For more detail about how to write the handlers, please take a look to the [samples](../samples) section of this project:
* Spring Integration -> [```event-api-spring-integration```](../samples/event-api-spring-integration)
* Plain Java handlers -> [```event-api-handlers```](../samples/event-api-handlers)

### Option 2: Use Spring Integration Tooling

If you're working on a Spring Integration application, but you don't want to use Spring Boot, then you can make use of the tooling classes explained in the
[section above](#spring-integration-tooling-library).

In order to use them, you only need to add the corresponding dependency to your ```pom.xml``` file:

```xml
    <dependency>
      <groupId>org.alfresco</groupId>
      <artifactId>alfresco-java-event-api-integration</artifactId>
      <version>5.1.5-SNAPSHOT</version>
    </dependency>
```

In this case, you can choose the way the events are consumed from the ActiveMQ topic and ingested into Spring Integration.

### Option 3: Use Event Handling Library

If you're not interested in working with Spring Integration or even with the Spring Framework, then you can make use of the interfaces and classes offered by
the event handling library explained in the [section above](#event-handling-library).

In order to use them, you only need to add the corresponding dependency to your ```pom.xml``` file:

```xml
    <dependency>
      <groupId>org.alfresco</groupId>
      <artifactId>alfresco-java-event-api-handling</artifactId>
      <version>5.1.5-SNAPSHOT</version>
    </dependency>
```

In this case, you can choose the way the events are consumed from the ActiveMQ topic and the way the event handling components are initialised and wired up to 
be able to react to each specific event (i.e. you can use [Dagger](https://dagger.dev/) as dependency injection engine with no problem).
