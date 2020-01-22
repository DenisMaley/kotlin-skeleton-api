# Skeleton API

This is a simple RESTful API implementation that can be extended for any purpose.

The Stack: Kotlin, [Spring Boot][Spring Boot].

## Requirements

To build this project you will need Java and [Gradle][Gradle] installed.

## Run

After cloning this repository, type the following commands to start the app:

```sh
gradle bootRun
```

Then visit [status endpoint][AppStatus] to check the status.
If you see 
 
 ```
"ok"
```
 
it means that everything went well.

## Usage

There are some endpoints:

Get user
```sh
curl http://localhost:8081/user
```

Post user
```sh
curl http://localhost:8081/user -H "content-type: application/json" -d "{ \"username\": \"test\", \"name\": \"test Test\", \"email\": \"test@test.com\"}"
```

Post user with username 'secret' as an example to handle error
```sh
curl http://localhost:8081/user -H "content-type: application/json" -d "{ \"username\": \"secret\", \"name\": \"test Test\", \"email\": \"test@test.com\"}"
```

[Spring Boot]: https://spring.io/projects/spring-boot
[Gradle]: https://gradle.org/
[AppStatus]: http://localhost:8081/status