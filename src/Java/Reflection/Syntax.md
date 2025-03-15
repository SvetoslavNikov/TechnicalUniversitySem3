### **Method stuff:**

- **Get a method's name:**
  ```java
  method.getName();
  ```

- **Get a method's return type:**
  ```java
  method.getReturnType();
  ```

- **Invoke a method:**
  ```java
  method.invoke(anyParameters, listedLikeThis);
  ```

- **If it's private or not accessible, make it accessible:**
  ```java
  method.setAccessible(true);
  ```

- **Check if a method has an annotation:**
  ```java
  method.isAnnotationPresent(NameOfAnnotation.class);
  ```

- **Get an annotation from a method:**
  ```java
  method.getAnnotation(NameOfAnnotation.class);
  ```

- **Get a method's parameter types:**
  ```java
  method.getParameterTypes();
  ```

- **Get annotations on a method's parameters:**
  ```java
  method.getParameterAnnotations();
  ```

- **Get the class that declares this method:**
  ```java
  method.getDeclaringClass();
  ```

- **Get all exceptions the method declares it can throw:**
  ```java
  method.getExceptionTypes();
  ```

---

### **Field stuff:**

- **Get the value of a field:**
  ```java
  field.get(objectToGetThisFieldFrom);
  ```

- **Get the type of a field:**
  ```java
  field.getType();
  ```

- **Set the value of a field:**
  ```java
  field.set(objectToSetThisFieldOn, valueToSetTheFieldTo);
  ```

- **Get the name of a field:**
  ```java
  field.getName();
  ```

- **Check if a field has an annotation:**
  ```java
  field.isAnnotationPresent(NameOfAnnotation.class);
  ```

- **Get an annotation from a field:**
  ```java
  field.getAnnotation(NameOfAnnotation.class);
  ```

- **Get the class that declares this field:**
  ```java
  field.getDeclaringClass();
  ```

---

### **Class stuff:**

- **Get a class's name:**
  ```java
  class.getName();
  ```

- **Check if a class has an annotation:**
  ```java
  class.isAnnotationPresent(NameOfAnnotation.class);
  ```

- **Get an annotation from a class:**
  ```java
  class.getAnnotation(NameOfAnnotation.class);
  ```

- **Get declared fields:**
  ```java
  class.getDeclaredFields();
  ```

- **Get all fields, including fields declared in parent classes:**
  ```java
  class.getFields();
  ```

- **Get declared methods:**
  ```java
  class.getDeclaredMethods();
  ```

- **Get all methods, including methods declared in parent classes:**
  ```java
  class.getMethods();
  ```

--- 

This should give you a concise overview of common reflections tasks in Java!