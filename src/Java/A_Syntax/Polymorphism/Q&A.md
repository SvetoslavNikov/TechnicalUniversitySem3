Absolutely — here are the **hardest and most interview-relevant questions on Java polymorphism and method overriding**, meant to **challenge even advanced learners**.

Each question pushes your understanding of:

* Runtime vs compile-time behavior
* Rules of method overriding and hiding
* Upcasting/downcasting
* `super`, `final`, `static`, and constructors in polymorphism
* Pitfalls and tricky behavior

---

## 🔥 Hard Polymorphism & Overriding Questions

---

### **1. What is the output?**

```java
class A {
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    void show() {
        System.out.println("B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

> ✅ Expected: `"B"`
> ✅ Why: Because `show()` is overridden, and method dispatch is dynamic (runtime polymorphism).

---

### **2. What about this version?**

```java
class A {
    static void show() {
        System.out.println("A");
    }
}

class B extends A {
    static void show() {
        System.out.println("B");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
    }
}
```

> ❌ **Expected: "A"**
> ❗ **Why?** This is **method hiding**, not overriding.
> `static` methods are resolved at **compile time** using the reference type (`A`).

---

### **3. What will this print?**

```java
class A {
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    void print() {
        System.out.println("B");
    }

    void onlyInB() {
        System.out.println("onlyInB");
    }
}

public class Test {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
        // obj.onlyInB();  // ← Uncomment this line
    }
}
```

> ❗ **What happens if you uncomment?**

✅ Answer: Compile error: **Cannot resolve method `onlyInB()` in `A`**
💡 Even though `obj` is a `B` at runtime, the compiler only sees it as `A`.
To call `onlyInB()`, you'd need to **downcast**:

```java
((B)obj).onlyInB();
```

---

### **4. What happens here?**

```java
class A {
    final void f() {
        System.out.println("A");
    }
}

class B extends A {
    void f() {  // ❌ Compile error
        System.out.println("B");
    }
}
```

> ❌ Answer: Compile-time error: **Cannot override final method `f()`**

---

### **5. Can you override a private method?**

```java
class A {
    private void hidden() {
        System.out.println("A");
    }
}

class B extends A {
    void hidden() {
        System.out.println("B");
    }
}
```

> ❗ **What happens when you call `new B().hidden();`?**

✅ Output: `B`
✅ Why: `hidden()` in `B` does **not override** the one in `A`.
It's a **completely new method**, because private methods are **not inherited**.

---

### **6. Constructors & Polymorphism: What's printed?**

```java
class A {
    A() {
        print();
    }
    void print() {
        System.out.println("A");
    }
}

class B extends A {
    int x = 5;

    void print() {
        System.out.println("B: x = " + x);
    }
}

public class Test {
    public static void main(String[] args) {
        new B();
    }
}
```

> ❗ **What will be printed and why?**

✅ Output:

```
B: x = 0
```

✅ Explanation:

* In constructor `A()`, `print()` is called → **dynamic dispatch** calls `B.print()`
* But `x` is not initialized yet (constructors run **top-down**), so it’s still `0`.

---

### **7. What happens when you cast?**

```java
class Animal {
    void speak() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Dog");
    }
    void bark() {
        System.out.println("Woof");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.speak();           // ?
        ((Dog)a).bark();     // ?
        ((Cat)a).speak();    // ❌ ???
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Cat");
    }
}
```

✅ `a.speak();` → `Dog`
✅ `((Dog)a).bark();` → `Woof`
❌ `((Cat)a).speak();` → **ClassCastException at runtime**
💡 You can't cast a `Dog` to a `Cat`, even though both extend `Animal`.

---

Would you like a quiz format next (you answer first), or should we move on to **Abstract classes vs Interfaces** or **Exception Handling**?
