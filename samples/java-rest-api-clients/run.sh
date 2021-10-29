#!/bin/sh

if [ -z "${M2_HOME}" ]; then
  export MVN_EXEC="mvn"
else
  export MVN_EXEC="${M2_HOME}/bin/mvn"
fi

start() {
    docker-compose up --build -d
}

down() {
    docker-compose down
}

build() {
    docker rmi java-rest-api-clients:development
    $MVN_EXEC clean package
}

tail() {
    docker-compose logs -f
}

start_sample() {
    docker-compose up --build -d java-rest-api-clients
}

stop_sample() {
    docker-compose kill java-rest-api-clients
    yes | docker-compose rm -f java-rest-api-clients
}

case "$1" in
  build_start)
    down
    build
    start
    tail
    ;;
  reload_sample)
    stop_sample
    build
    start_sample
    tail
    ;;
  start)
    start
    tail
    ;;
  stop)
    down
    ;;
  tail)
    tail
    ;;
  *)
    echo "Usage: $0 {build_start|reload_sample|start|stop|tail}"
esac
