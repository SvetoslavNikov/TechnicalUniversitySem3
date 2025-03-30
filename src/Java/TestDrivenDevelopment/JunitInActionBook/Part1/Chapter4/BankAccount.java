package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter4;

public class BankAccount {
    private double balance;

    public BankAccount() {
        this.balance = 0;
    }

    public void deposit(double num){
        if(num < 0){
            throw new IllegalArgumentException("Input positive num");
        }
        balance += num;
    }

    public void withdraw(double num){
        if(num < 0){
            throw new IllegalArgumentException("Input positive num");
        }

        if(this.balance < num){
            throw new IllegalArgumentException("I am not that rich sorry");
        }

        balance -= num;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
