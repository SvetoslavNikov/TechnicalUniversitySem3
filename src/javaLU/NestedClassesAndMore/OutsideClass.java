package javaLU.NestedClassesAndMore;

public class OutsideClass {

    static int min = 5;//so we can use it in the return
    // in the inside class method

    int max = 10;
    public int printNums(int a, int b){
        System.out.println("printNums method OutsideClass");
        return a+b+min+max;
    }

    public class InsideClass {
        int min  = 4;
        int max = 9;
        public int printNums(int a, int b){
            System.out.println("Ïnside class");

            class InsideMethod{
                //cannot have access modifier
                // cus it's in a method
                public void hi(){
                    System.out.println("Hey this is inside Inside method");
                }
            }
            //only place we can use it is here inside the method

            InsideMethod s = new InsideMethod();
            s.hi();
            return a+b+OutsideClass.min+max;
        }



    }
}



