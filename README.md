# spring-config-testharness
Sample Spring Boot app demonstrating use of ```application.yml``` and external ```application-{profile}.properties``` files convention

```
java -jar spring-config-testharness-0.0.1-SNAPSHOT.jar --spring.config.location=classpath:/,../conf/ --spring.profiles.active=qa
```

```src/main/resources/application.yml``` – contains default, static values as well as development-specific settings
-	These are the only settings that you would use in your IDE – you wouldn’t try to pick up external properties from
```src/main/conf/application-{profile}.properties``` – properties file that sets profile-specific values
```src/main/conf/application-{profile}.yml``` – properties file in YAML format that sets profile-specific values (don't use tabs)
- these profile-specific files could even be left out of source control and be managed separately/manually (keeping production passwords out of git)
- also can use environment variables to control which profile is active:

```
export SPRING_CONFIG_LOCATION=classpath:./,../conf/
export SPRING_PROFILES_ACTIVE=qa
java -jar spring-config-testharness-0.0.1-SNAPSHOT.jar 
```

- you can even set SPRING_APPLICATION_JSON with an entire YAML equivalent set of properties:

```
export SPRING_APPLICATION_JSON='{"ec2":{"public":{"url":"http://mydomain.com"}}}'
```

in the pom.xml:
-	spring-boot-maven-plugin takes care of building executable spring boot jar - which can be directly deployed as an [init.d or systemd service](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#deployment-systemd-service)
-	maven-assembly-plugin takes executable spring boot jar and tar-balls it with the external properties files
 - layout of tar.gz file is /lib and /conf
 - can add a /bin for the java app wrapper shell scripts (like tanukisoftware jsw)


