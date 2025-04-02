package Java.G_Lambdas_Streams;

public class RunnableLambda {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Hey thats the run method right there");
        };


        runnable.run();
    }
}
