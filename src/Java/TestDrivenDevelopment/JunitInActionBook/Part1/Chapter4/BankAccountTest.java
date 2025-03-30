package Java.TestDrivenDevelopment.JunitInActionBook.Part1.Chapter4;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account = new BankAccount();


    @BeforeEach
    public void setAccountToZero(){
        account.setBalance(0);
    }

    @Test
    public void testDeposit() {
        account.setBalance(0);
        assertEquals(0.0, account.getBalance(),0.01);

        account.deposit(200);
        assertEquals(200.0, account.getBalance(),0.01);

        account.deposit(533);
        assertEquals(733.0, account.getBalance(),0.01);
    }

    @Test
    public void testDepositNegativeNum() {
        assertThrows(IllegalArgumentException.class,() -> account.deposit(-666));
    }

    @Test
    public void testCorrectWithdraw(){
        account.deposit(500);
        account.withdraw(500);
        assertTrue(account.getBalance() == 0);
    }

    @Test
    public void testIncorrectWithdraw(){
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(9999));

        account.deposit(500);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(-500));
    }

}
