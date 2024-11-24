package JavaOOP.Solid.InterfaceSegragationPrinciple;

public class Correct {
    public static void main(String[] args) {
        Correct b = new Correct();
        MulltiFunctionPrinter a = b.new MulltiFunctionPrinter();
        a.fax();
        a.scan();
        a.printMe();

    }


    interface CanPrint {
        void printMe();
    }

    interface CanScan {
        default void scan() {
            System.out.println("Can scan");
        }
    }

    interface CanFax {
        void fax();
    }

    class MulltiFunctionPrinter implements CanFax, CanPrint, CanScan {
        @Override
        public void fax() {
            System.out.println("Can fax");
        }

        @Override
        public void printMe() {
            System.out.println("Can print");
        }

        @Override
        public void scan() {
            System.out.println("Can scan docs");
        }
    }

    class SimplePrinter implements CanPrint {
        @Override
        public void printMe() {
            System.out.println("Can print for sure");
        }
    }
}