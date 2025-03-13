package Java.Project_A_to_H_included;

abstract class Product {
    private Long id;
    private String name;
    private float price;

    abstract void printProperties();
}

class Book extends Product{

    @Override
    void printProperties() {

    }
}
class Electronics extends Product{

    @Override
    void printProperties() {

    }
}

