package javaLU.Hashfunctions.Clothes;

public class Clothes {
    private String type;
    private String size;
    private int price;

    public Clothes(String type, String size, int price){
        setType(type);
        setSize(size);
        setPrice(price);
    }

    public Clothes(){
        setType("undefined type");
        setSize("undefined size");
        setPrice(0);
    }

    @Override
    public int hashCode() {
        int result = 240;
        //condition ? iftrue : ifnot
        result += (getSize() != null ? getSize().hashCode() : 0);
        result += (getType() != null ? getType().hashCode() : 0);
        result += getPrice()*result;
        return result;
    }


    //write it again again again
    @Override
    public boolean equals(Object obj){
        if(obj == this){//checks if the objects have the same addresses
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            //checks if the objects are same type of objects
            return false;
        }

        Clothes obj1 = (Clothes) obj;//initializing an object of this type, so we can use get methods
        if (type == null) {
            if (obj1.type != null) {
                return false;
            }
        } else if (!type.equals(obj1.type)) {
            return false;
        }

        if (size == null) {
            if (obj1.size != null) {
                return false;
            }
        } else if (!size.equals(obj1.size)) {
            return false;
        }

        if (price != obj1.price) {
            return false;
        }

        return true;
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
