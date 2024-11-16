package javaLU.Generics.SoftUni;

public class GenericClass <T>{
    private T t;
    public GenericClass(T t){
        this.t=t;
    }
    public void findMyClass(){
        System.out.println(this.t.getClass());
    }

    public void printMe(){
        System.out.println(this.t);
    }
}
