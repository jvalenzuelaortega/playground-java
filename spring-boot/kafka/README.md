# Kafka Integration

Spring boot multi-module application that integrates a basic example of Apache Kafka

## Getting started 🚀

To test the project it is essential to have some tools

See **Deployment** to learn how to deploy the project.


### Prerequisites 📋

```
Java 21
Gradle 8.0
Git
```

### Installation 🔧

To begin, you must have Kafka installed and running on the local computer. For more information, check this link: https://kafka.apache.org/quickstart

By default, the configured topic is ***quickstart-events***, the same one used in Apache Kafka quickstart

After previous configurations, clone the project
```
git clone https://github.com/jvalenzuelaortega/playground-java.git
```

once downloaded, go to the route where the project is located in:

```
cd spring-boot/kafka
```

```
gradle bootRun
```

The project should run smoothly.

To test sending messages, use the following curl, from the producer application. In the consumer project console, you should receive a json with the structure of the message sent by the producer
```
curl --location 'localhost:8082/publish' \
--header 'Content-Type: application/json' \
--data '{
    "message" : "Hello world in kafka"
}'
```

## Running the tests ⚙️

To run the tests, the following command must be executed at the root of each project

```
gradle test
```

## Built with 🛠️

_Mention the tools you used to create your project_

* [Spring Boot](https://spring.io/projects/spring-boot) - Java Framework
* [Gradle](https://gradle.org/) - Dependency manager

## Contributing 🖇️

_In construction ..._

## Versioned 📌

_In construction ..._

## Authors ✒️

* **Juan Valenzuela** - *Base development* - [jvalenzuelaortega](https://github.com/jvalenzuelaortega)