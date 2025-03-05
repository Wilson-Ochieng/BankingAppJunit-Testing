package demo;

public class BankingApp {  
    public static void main(String[] args) {
    BankService bankService = new BankService();
    bankService.createAccount("12345", 1000.0);
    bankService.deposit("12345", 500.0);
    bankService.withdraw("12345", 200.0);
    System.out.println("Balance: " + bankService.getBalance("12345"));
}
}
