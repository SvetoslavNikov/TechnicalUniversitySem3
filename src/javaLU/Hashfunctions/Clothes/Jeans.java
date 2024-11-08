package javaLU.Hashfunctions.Clothes;

import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class Jeans {
    private String type;
    private String size;
    private int price;

    public Jeans(String type, String size, int price){
        setType(type);
        setSize(size);
        setPrice(price);
    }

    public Jeans(){
        setType("undefined type");
        setSize("undefined size");
        setPrice(0);
    }

    @Override
    public int hashCode() {
        int result = 240;
        result += (getSize() != null ? getSize().hashCode() : 0);
        result += (getType() != null ? getSize().hashCode() : 0);
        result += getPrice();

        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            System.out.println(this + "\nand\n " + obj + "\nsame adress");
            return true;
        }

        if(obj == null || getClass() != obj.getClass()){
            return false;
        }


        Jeans jeans2 = (Jeans) obj;


        return getPrice() == this.getPrice() &&
                Objects.equals(getSize(), jeans2.getSize()) &&
                Objects.equals(getType(), jeans2.getType());
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setType(String type) {
        this.type = type;
    }
}
