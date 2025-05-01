package Java.J_Design_Patterns.Strategy;

public class TaxCalculatorExercise {
}

interface TaxCalculatorStrategy{
    double calculateTax(double amount);
}

class TaxCalculator{
    private TaxCalculatorStrategy taxCal;

    public TaxCalculator(TaxCalculatorStrategy taxCal){
        this.taxCal = taxCal;
    }

    double calculateTax(double amount){
        if(taxCal == null){
            return amount*0.05;
        }
        return taxCal.calculateTax(amount);
    }
}

class UsTaxCalculator implements TaxCalculatorStrategy{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.07;
    }
}

class EuTaxCalculator implements TaxCalculatorStrategy{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.2;
    }
}

class AsiaTaxCalculator implements TaxCalculatorStrategy{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.1;
    }
}

class CanadaTaxCalculator implements TaxCalculatorStrategy{
    @Override
    public double calculateTax(double amount) {
        return amount * 0.1;
    }
}

