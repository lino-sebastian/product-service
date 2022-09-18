FROM openjdk:8-alpine
EXPOSE 8080
ADD target/product-service.jar product-service-application.jar
ENTRYPOINT ["java","-jar","product-service-application.jar"]