# Spring Cloud Netflix
- https://www.baeldung.com/spring-cloud-netflix-eureka
- Spring Starter: https://start.spring.io/

## Generate Eureka Server
- Add Eureka Server dependecy

## Generate Eureka Client
- Add Eureka Client dependecy: spring-cloud-starter-netflix-eureka-client
- Add Spring web dependency: spring-boot-starter-web

## Generate Spring Cloud Eureka Feign Client
- Add Eureka Client dependecy: spring-cloud-starter-netflix-eureka-client
- Add Spring web dependency: spring-boot-starter-web
- Add openfeign client: spring-cloud-starter-openfeign(Before: spring-cloud-starter-feign)
- Add thymeleaf dependency: spring-boot-starter-thymeleaf

Eureka Server:
- URL: http://localhost:8761/

Eureka Client:
- Random port, we call it by service name

Eureka Feign Client:
- URL: http://localhost:8080/get-greeting

Call Eureka Client using Feign Client

