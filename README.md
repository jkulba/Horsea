<a href="https://github.com/jkulba/Horsea/">
    <img alt="Horsea Project" src="https://github.com/jkulba/Horsea/blob/main/horsea.png"
    width="75" height="75">
</a>

# The Horsea Project

Horsea is a Water type Pokémon introduced in Generation 1. It is known as the Dragon Pokémon.

## Apache Maven and spring-boot useful commands

### Clean and build project

```
$ mvn clean install
```

### Clean and run service locally

```
$ mvn clean spring-boot:run
```

## Docker usefull commands

### Buildimage

```
$ sudo docker build -t jkulba/horsea:1.0 .
```

### Run docker container

```
$ sudo docker run -d -p 8080:8080 -t jkulba/horsea:1.0
```

### Live tail docker logs using the container ID

```
$ docker ps
$ docker logs --follow <container ID>
```

### Stop running container using the container ID

```
$ docker ps
$ docker stop <container ID>
```
