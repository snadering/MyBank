package myBank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import static org.junit.jupiter.api.Assertions.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class BankAccountTest {
    
    @org.junit.jupiter.api.Test
    void setOwner() {
        SalaryAccount account = new SalaryAccount();
        Customer Lars = new Customer();
        account.setOwner(Lars);
        account.setOwner(Lars);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        SalaryAccount account = new SalaryAccount();
        assertFalse(account.withdraw(-100));
        assertTrue(account.withdraw(100));
        assertFalse(account.withdraw(0));
        assertTrue(account.withdraw(100.25));
        assertTrue(account.withdraw(0.25));
        assertFalse(account.withdraw(-100.25));

    }

    @org.junit.jupiter.api.Test
    void deposit() {
        SalaryAccount account = new SalaryAccount();
        account.deposit(-100);
        account.deposit(100);
        account.deposit(0);
        account.deposit(0.25);
        account.deposit(-100.25);
        account.deposit(100.25);
    }
}