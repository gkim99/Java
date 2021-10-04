import java.text.DecimalFormat;

public class BankAccountTest {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("$###,###.00");
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();

        System.out.println("Total Number of Bank Accounts: " + BankAccount.getBankAccounts());

        account1.deposit("checking", 100);
        account1.deposit("savings", 250);
        System.out.println("Checking Balance: " + f.format(account1.getCheckingBalance()));
        System.out.println("Savings Balance: " + f.format(account1.getSavingsBalance()));

        account1.withdraw("checking", 50);
        account1.withdraw("savings", 300);
        System.out.println("Checking Balance: " + f.format(account1.getCheckingBalance()));
        System.out.println("Savings Balance: " + f.format(account1.getSavingsBalance()));

        System.out.println("Total Balance: " + f.format(account1.getTotalAmount()));
    }
}