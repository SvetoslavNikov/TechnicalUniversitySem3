Let me break it down for you!

### 1. **JAR File**
A **JAR** (JavaRevise Archive) file is a package that contains your entire compiled
JavaRevise application (all classes, resources, and dependencies). Think of it like a zip file for your JavaRevise code.

In a **Spring Boot** app, `mvn package` or `gradle build` will typically 
create a JAR in the `target` directory (for Maven users). This JAR includes
everything needed to run the app, including:
- Compiled classes
- Dependencies
- Spring Boot’s built-in server

When you run `java -jar app.jar`, JavaRevise knows how to load and run the application inside the JAR.

---

### 2. **ENTRYPOINT**
The `ENTRYPOINT` in a Dockerfile tells Docker how to start the container. In your case:

```dockerfile
ENTRYPOINT ["java","-jar","/app/app.jar"]
```

It’s like telling Docker:
- Run the `java` command
- Use the `-jar` option to indicate that you are running a JAR file
- The path `/app/app.jar` is where the app lives in the container

When the container starts, it will automatically run your Spring Boot app.

---

In short, the Dockerfile builds an environment where your Spring Boot app (the JAR file) 
is executed automatically inside the container. Let me know if you want more details 
on building or running this container!