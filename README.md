# HazelCast
Hazelcast is an operational, in-memory, distributed computing platform for managing data and performing parallel execution for application speed and scale.

# Discovery Server
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.


# What is Eureka?
Eureka is a REST (Representational State Transfer) based service that is primarily used in the cloud for locating services for the purpose of load balancing and failover of middle-tier servers. We call this service, the Eureka Server. Eureka also comes with a Java-based client component,the Eureka Client, which makes interactions with the service much easier. The client also has a built-in load balancer that does basic round-robin load balancing. At Netflix, a much more sophisticated load balancer wraps Eureka to provide weighted load balancing based on several factors like traffic, resource usage, error conditions etc to provide superior resiliency.

# What is the need for Eureka?
Because of its inherent nature, servers come and go. Unlike the traditional load balancers which work with servers with well known IP addresses and host names, in AWS, load balancing requires much more sophistication in registering and de-registering servers with load balancer on the fly. Since AWS does not yet provide a middle tier load balancer, Eureka fills a big gap in the area of mid-tier load balancing.


# Benefits: 

 High Availability, Zones and Regions
 
 Standalone Mode
 
 Peer Awareness
 
 When to Prefer IP Address
 
 Securing The Eureka Server

# Config Server

Spring Cloud Config provides server and client-side support for externalized configuration in a distributed system. With the Config Server you have a central place to manage external properties for applications across all environments.


# Actuator

Actuator is a Spring Boot module, which adds REST/JMX endpoints to your application, so you can easily monitor and manage it in production. The endpoints offer health-check, metrics monitoring, access to logs, thread dumps, heap dumps, environmental info and more. 


# Spring boot Admin 

Actuator is powerful and great and it is easy and convenient to consume the endpoints with some other application - you just make a simple REST call. It is not so great when used by a human. For humans, it is much more convenient to have a nice user interface you can use to browse all the monitoring data and manage your application. This is actually what Spring Boot Admin Does. It provides you a nice UI layer on top of actuator endpoints with a few extra features on top.

It provides the following features for registered applications.

Show health status<br/>
Show details, like<br/>
JVM & memory metrics<br/>
micrometer.io metrics<br/>
Datasource metrics<br/>
Cache metrics<br/>
Show build-info number<br/>
Follow and download logfile<br/>
View jvm system- & environment-properties<br/>
View Spring Boot Configuration Properties<br/>
Support for Spring Cloud's postable /env- &/refresh-endpoint<br/>
Easy loglevel management<br/>
Interact with JMX-beans<br/>
View thread dump<br/>
View http-traces<br/>
View auditevents<br/>
View http-endpoints<br/>
View scheduled tasks<br/>
View and delete active sessions (using spring-session)<br/>
View Flyway / Liquibase database migrations<br/>
Download heapdump<br/>
Notification on status change (via e-mail, Slack, Hipchat, ...)<br/>
Event journal of status changes (non persistent)<br/>