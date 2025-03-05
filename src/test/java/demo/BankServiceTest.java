package demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankServiceTest {
    private BankService bankService;

    @BeforeEach
    public void setUp() {
        bankService = new BankService();
        bankService.createAccount("12345", 1000.0);
    }

    @Test
    public void testCreateAccount() {
        assertThrows(IllegalArgumentException.class, () -> bankService.createAccount("12345", 500.0));
    }

    @Test
    public void testDeposit() {
        bankService.deposit("12345", 500.0);
        assertEquals(1500.0, bankService.getBalance("12345"));
    }

    @Test
    public void testWithdraw() {
        bankService.withdraw("12345", 200.0);
        assertEquals(800.0, bankService.getBalance("12345"));
    }

    @Test
    public void testInvalidWithdraw() {
        assertThrows(IllegalArgumentException.class, () -> bankService.withdraw("12345", 2000.0));
    }

    @Test
    public void testGetBalance() {
        assertEquals(1000.0, bankService.getBalance("12345"));
    }
}
