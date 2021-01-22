# Actuator Sample Project

This project spins up a simple Spring Boot Web project
and exposes several actuator endpoints

`/actuator/health`
`/actuator/info`
`/actuator/metrics`

## Getting Started

Clone this repository:
`git clone git@github.com/shinjonathan/actuator-demo`

Navigate to project root and boot up the project
```
cd actuator-demo
./gradlew clean bootRun
```

In a separate shell run `load_samples.sh`
```
sh load_samples.sh
```

This will provide some information to be exposed via the actuator metrics endpoint.


## Docker
If you prefer to boot this project using docker, you may do so
First build the docker image:

`docker build -t actuator-demo .`

Run it with port 8080 exposed on the host and container

`docker run -p 8080:8080 actuator-demo`

In a separate shell, you will want to run `sh load_samples.sh`

### Primer on Actuator Metrics
Either in a web browser navigate to `http://localhost:8080/actuator/metrics`

Any metrics supplied by that endpoint is traversable if you drop that into the url path.

This will provide a high level overview of all HTTP requests served by this project

`curl "localhost:8080/actuator/metrics/http.server.requests"`

The tags that are provided can be used to set request parameters.

`curl "localhost:8080/actuator/metrics/http.server.requests?tag=status:500&tag=uri:/endpointA"`
