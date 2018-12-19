# spring-config-testharness
Sample Spring Boot app demonstrating use of application.yml and external application-{profile}.properties files convention

```
java -jar spring-config-testharness-0.0.1-SNAPSHOT.jar --spring.config.location=classpath:./,../conf/ --spring.profiles.active=qa
```

```src/main/resources/application.yml``` – contains default, static values as well as development-specific settings
-	These are the only settings that you would use in your IDE – you wouldn’t try to pick up external properties from
```src/main/conf/application-{profile}.properties``` – properties file that sets profile-specific values
- these profile-specific files could even be left out of source control and be managed separately/manually (keeping production passwords out of git)

in the pom.xml:
-	spring-boot-maven-plugin takes care of building executable spring boot jar
-	maven-assembly-plugin takes executable spring boot jar and tar-balls it with the external properties files
 - layout of tar.gz file is /lib and /conf
 - can add a /bin for the java app wrapper shell scripts (like tanukisoftware jsw)
