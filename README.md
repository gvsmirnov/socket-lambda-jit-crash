= Description

This is a reduced test case of when @netty, Java 8 lambdas, Java agents, and Windows
meet to have a crash.

= Steps to reproduce

Clone the repo, and then execute:

```
gradlew.bat agentJar
java -javaagent:build/libs/agent.jar -jar build/libs/agent.jar
```

= Requirements

This is known to reproduce on:

```
OS: Windows 7 , 64 bit Build 7601 Service Pack 1
vm_info: Java HotSpot(TM) 64-Bit Server VM (25.25-b02) for windows-amd64 JRE (1.8.0_25-b18), built on Oct  7 2014 14:25:37 by "java_re" with MS VC++ 10.0 (VS2010)
```

An sample error report is available in this repo.