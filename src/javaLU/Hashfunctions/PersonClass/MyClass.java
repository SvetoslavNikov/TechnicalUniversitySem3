package javaLU.Hashfunctions.PersonClass;

import java.util.Objects;

public class MyClass {
    private int id;
    private Person name;

    public MyClass(int id, Person name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyClass myClass = (MyClass) o;
        return id == myClass.id && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
