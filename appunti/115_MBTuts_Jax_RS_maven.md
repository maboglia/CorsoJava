# 1. Java Jax-RS maven archetype
<!-- TOC -->

- [1. Java Jax-RS maven archetype](#1-java-jax-rs-maven-archetype)
  - [1.1. crea il progetto maven da CLI - linead i comando](#11-crea-il-progetto-maven-da-cli---linead-i-comando)
  - [1.2. fissa il problema delle dipendenze di javax con le nuove JDK](#12-fissa-il-problema-delle-dipendenze-di-javax-con-le-nuove-jdk)
  - [1.3. evitare l'errore sulla index.jsp](#13-evitare-lerrore-sulla-indexjsp)
  - [1.4. build con maven e run su tomcat](#14-build-con-maven-e-run-su-tomcat)

<!-- /TOC -->

## 1.1. crea il progetto maven da CLI - linead i comando

```java
mvn archetype:generate -DarchetypeGroupId=org.glassfish.jersey.archetypes \
    -DarchetypeArtifactId=jersey-quickstart-webapp -DarchetypeVersion=2.28

```

## 1.2. fissa il problema delle dipendenze di javax con le nuove JDK

```xml
<dependency>
    <groupId>javax.xml.bind</groupId>
    <artifactId>jaxb-api</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-core</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>com.sun.xml.bind</groupId>
    <artifactId>jaxb-impl</artifactId>
    <version>2.2.11</version>
</dependency>
<dependency>
    <groupId>javax.activation</groupId>
    <artifactId>activation</artifactId>
    <version>1.1.1</version>
</dependency>
```

## 1.3. evitare l'errore sulla index.jsp

```xml
<dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
</dependency>
```

## 1.4. build con maven e run su tomcat 

http://localhost:8080/medaglie-web/webapi/myresource