# Spring Cloud + Eureka(高可用) + Ribbon(负载) 简单整合例子

#### 项目使用的框架

- Spring Boot (1.3.8.RELEASE);
- Spring Cloud (Brixton.SR7);


#### 开发环境
- System:Windows 10 x64 
- IntelliJ IDEA 2017.1
- java version "1.8.0_91"


#### 测试
- 服务注册中心  
java -jar eureka-server-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1  
java -jar eureka-server-demo-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2  

- 服务提供者 
java -jar hello-0.0.1-SNAPSHOT.jar --server.port=8081 -Xmx256m -Xms256m  
java -jar hello-0.0.1-SNAPSHOT.jar --server.port=8082 -Xmx256m -Xms256m  

- 服务消费者
java -jar ribbon-consumer-0.0.1-SNAPSHOT.jar  


