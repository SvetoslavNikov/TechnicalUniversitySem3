package Java.A_Syntax;

public class Enums {
    public static void main(String[] args) {
        Status connection = Status.SUCCESS;


        switch (connection.getCode()) {
            case 200 -> System.out.println("Connection is successful!");
            case 500, 404 -> System.out.println("damn no connection today :)");
        }

        switch (connection) {
            case SUCCESS -> System.out.println("cool");
            case ERROR, NOT_FOUND -> System.out.println("not cool");
        }

    }
}

enum Status {
    SUCCESS(200), ERROR(500), NOT_FOUND(404);
    private final int code;

    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
