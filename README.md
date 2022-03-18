# restTemplt
A spring boot RESTful API template for java & REST API beginner


## Prerequist
- MS-SQL docker image installed and run on local for testing
refer to: [mssql docker image on dockerhub](https://hub.docker.com/_/microsoft-mssql-server)


## build image from source
The base image is using official wildfly and also do maven build in the Dockerfile
```
docker build -f ./docker/Dockerfile --tag=resttemplt .
```

## run the docker image
```
docker run --name=rest-templt -d -p 8080:8080 -p 9990:9990 resttemplt
```

## The offered REST APIs in the folder:
`./src/main/java/com/wei/example/rest`

## Support Swagger UI (TODO)
