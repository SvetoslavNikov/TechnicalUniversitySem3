package Java.A_Syntax.Records;

public record MovieRecord(String title, double price) {
        public MovieRecord{
            if(price < 0){
                throw new IllegalArgumentException("Not good price");
            }
        }
}


class Test{
    public static void main(String[] args){
        MovieRecord mov = new MovieRecord("title", -3.33);
        MovieRecord mov1 = new MovieRecord("title", 3.33);

        mov.title();
        mov.price();
        mov.toString();
        System.out.println(mov.equals(mov1));
    }
}
