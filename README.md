### Description

This is a reduced test case of when Netty, Java 8 lambdas, Java agents, and Windows
meet to have a crash.

### Steps to reproduce

Clone the repo, and then execute on any java 8 version prior to 8u40:

```
$ gradlew.bat agentJar
$ java -javaagent:build/libs/agent.jar -jar build/libs/agent.jar
```


A [sample error report](https://github.com/gvsmirnov/netty-lambda-windows-crash/blob/master/hs_err_pid348.log) is available in this repo.
