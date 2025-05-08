package Java.J_Design_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

public class Structure {
    public static void main(String[] args){
        Component leaf1 = new Leaf("A");
        Component leaf2 = new Leaf("B");

        Composite composite = new Composite("C");

        composite.add(leaf1);
        composite.add(leaf2);

        composite.operation();
    }
}

interface Component{
    void operation();
}

class Leaf implements Component{
    private String name;
    public Leaf(String name){
        this.name = name;
    }
    @Override
    public void operation(){
        System.out.println("Leaf "+ name + " operation");
    }
}

class Composite implements Component{
    private List<Component> children = new ArrayList<>();
    private String name;
    public Composite(String name){
        this.name = name;
    }
    public void add(Component component){
        children.add(component);
    }
    public void remove(Component component){
        children.remove(component);
    }
    @Override
    public void operation() {
        System.out.println("Composite "+ name + " operation");

        for(Component component : children){
            component.operation();
        }

    }
}



























