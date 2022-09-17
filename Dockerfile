FROM openjdk:8-alpine
ADD target/product-service.jar product-service-application.jar
ENTRYPOINT ["java","-jar","product-service-application.jar"]