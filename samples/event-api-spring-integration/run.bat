@ECHO OFF

IF [%M2_HOME%]==[] (
    SET MVN_EXEC=mvn
)

IF NOT [%M2_HOME%]==[] (
    SET MVN_EXEC=%M2_HOME%\bin\mvn
)

IF [%1]==[] (
    echo "Usage: %0 {build_start|reload_sample|start|stop|tail}"
    GOTO END
)

IF %1==build_start (
    CALL :down
    CALL :build
    CALL :start
    CALL :tail
    GOTO END
)
IF %1==reload_sample (
    CALL :stop_sample
    CALL :build
    CALL :start_sample
    CALL :tail
    GOTO END
)
IF %1==start (
    CALL :start
    CALL :tail
    GOTO END
)
IF %1==stop (
    CALL :down
    GOTO END
)
IF %1==tail (
    CALL :tail
    GOTO END
)

echo "Usage: %0 {build_start|reload_sample|start|stop|tail}"
:END
EXIT /B %ERRORLEVEL%

:down
    docker-compose down
EXIT /B 0
:build
    docker rmi event-api-si-sample:development
    call %MVN_EXEC% clean package
EXIT /B 0
:start
    docker-compose up --build -d
EXIT /B 0
:tail
    docker-compose logs -f
EXIT /B 0
:stop_sample
    docker-compose kill event-api-si-sample
    docker-compose rm -f event-api-si-sample
EXIT /B 0
:start_sample
    docker-compose up --build -d event-api-si-sample
EXIT /B 0