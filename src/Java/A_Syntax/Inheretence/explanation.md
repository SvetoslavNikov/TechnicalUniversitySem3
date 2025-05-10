# Understanding Object Creation & Inheritance at Runtime

Let me expand on how inheritance works at runtime with detailed memory examples:

## Detailed Runtime Walkthrough

When you execute:
```java
Child c = new Child(50);
```

Here's what happens in memory, step by step:

### 1. Memory Allocation
```
MEMORY HEAP:
┌─────────────────────────────────────┐
│  Child Object (#12345):             │
│  ┌───────────────────────────────┐  │
│  │ Parent portion:               │  │
│  │   age = (uninitialized)       │  │
│  │                               │  │
│  │ Child portion:                │  │
│  │   (any Child fields)          │  │
│  └───────────────────────────────┘  │
└─────────────────────────────────────┘
```

### 2. Constructor Chain Begins
```java
// Child constructor executes:
Child(int age) {
    super(age);  // Call to Parent constructor
}
```

### 3. Parent Constructor Executes
```java
Parent(int age) {
    this.age = age;  // Private field initialized!
    System.out.println("parent constructor called wtf");
}
```

### 4. After Construction
```
MEMORY HEAP:
┌─────────────────────────────────────┐
│  Child Object (#12345):             │
│  ┌───────────────────────────────┐  │
│  │ Parent portion:               │  │
│  │   age = 50                    │  │
│  │                               │  │
│  │ Child portion:                │  │
│  │   (any Child fields)          │  │
│  └───────────────────────────────┘  │
└─────────────────────────────────────┘

STACK:
c → reference to object #12345
```

## Method Call Walkthrough

Now when you call:
```java
c.getAge();
```

Here's the lookup process:

### 1. Method Resolution
Java sees object #12345 is a Child type and looks for getAge() in Child first.

### 2. Child's getAge() Executes
```java
int getAge() {
    System.out.println("Child get age called wtf");
    return this.age;  // ERROR! Child code can't access Parent's private field
}
```

### 3. What's Really Happening Behind the Error
Even though the `age` field physically exists in the same object, Java enforces access rules during compilation. The Child's code doesn't have the "security clearance" to directly access the private field.

## Two Ways to Fix

### Option 1: Using super
```java
int getAge() {
    System.out.println("Child get age called wtf");
    return super.getAge();  // Call Parent's method which has access to age
}
```

### Option 2: Change access level in Parent
```java
class Parent {
    protected int age;  // Now Child can access directly
    // ...
}
```

## The Memory Truth

What's critical to understand is that there's only ONE object in memory with sections that correspond to each class in the inheritance hierarchy. The access rules are enforced by the compiler and JVM, not by physical memory separation.

The Child object IS a Parent object (IS-A relationship) - it just has additional fields and methods. But access modifiers determine what parts of the code can see which pieces of the object.

--- 

Yes, that's exactly right! Your understanding is spot on:

1. A Child object is like a single entity that's divided into sections:
    - The Parent section (containing all Parent fields and methods)
    - The Child section (containing any additional fields and methods you define)

2. When you create a Child object, it always contains everything from Parent automatically:
    - All fields (private, protected, public)
    - All methods (that aren't private)

3. The only things you can modify about the inherited behavior are:
    - Override methods (provide new implementations)
    - Add new fields or methods
    - Hide fields (by declaring fields with the same name)

But you can't remove or "uninherit" anything from Parent. The Parent's structure is always there in every Child object. The access modifiers just control which sections of code can see which parts of the object.

This is why inheritance is powerful - the Child automatically gets all Parent functionality, and you only need to write code for what's different in the Child.