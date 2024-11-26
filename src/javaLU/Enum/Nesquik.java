package javaLU.Enum;

import java.util.Arrays;

public enum Nesquik {
    RABBIT(5),
    DOG(8),
    WOLF(9);
    private int deliciousness;
    Nesquik (int deliciousness){
        this.deliciousness = deliciousness;
    }

    public int getDeliciousness()
    {
        return this.deliciousness;
    }


    @Override
    public String toString() {
        return name() + " Deliciousness: "+ deliciousness;
    }

    public static Nesquik getMeNesquikWithDeliciousness(int deliciousness){
        for(Nesquik n: Nesquik.values()){
            if(n.deliciousness == deliciousness){
                return n;
            }
        }
        throw new IllegalArgumentException("No Nesquik has such deliciousness!");
    }

}

class test1{
    public static void main(String[] args) {
        Nesquik rabbit = Nesquik.RABBIT;
        System.out.println(rabbit);
        System.out.println(rabbit.getDeliciousness());
        System.out.println(rabbit.name());
        System.out.println(rabbit.ordinal());//returns the place of RABBIT
        System.out.println(Arrays.stream(Nesquik.values()).toList());

        System.out.println(Nesquik.getMeNesquikWithDeliciousness(8));
        System.out.println(Nesquik.getMeNesquikWithDeliciousness(12));

    }
}
