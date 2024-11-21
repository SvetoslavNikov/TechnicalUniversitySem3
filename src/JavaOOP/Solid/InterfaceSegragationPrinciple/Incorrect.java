package JavaOOP.Solid.InterfaceSegragationPrinciple;

public class Incorrect {
//"Clients should not be forced to depend on interfaces they do not use."
}

interface Machine {
    void print();
    void scan();
    void fax();
}

class MultiFunctionPrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document...");
    }

    @Override
    public void fax() {
        System.out.println("Faxing document...");
    }
}

class SimplePrinter implements Machine {
    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        // This is not needed
        throw new UnsupportedOperationException("Scanning not supported.");
    }

    @Override
    public void fax() {
        // This is not needed
        throw new UnsupportedOperationException("Faxing not supported.");
    }
}
