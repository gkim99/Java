public class BankAccount {
    private double checkingBalance;
    private double savingsBalance;
    static int numBankAccounts = 0;
    static double totalAmount;

    public BankAccount(){
        numBankAccounts++;
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public static int getBankAccounts() {
        return numBankAccounts;
    }

    public void deposit(String accountType, double amount){
        totalAmount += amount;
        if(accountType.equals("checking")){
            checkingBalance += amount;
        } else if(accountType.equals("savings")){
            savingsBalance += amount;
        }
    }

    public void withdraw(String accountType, double amount){
        if(accountType.equals("checking")){
            if(amount < checkingBalance){
                checkingBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        } else if(accountType.equals("savings")){
            if(amount < savingsBalance){
                savingsBalance -= amount;
                totalAmount -= amount;
            } else {
                System.out.println("Insufficient Funds");
            }
        }
    }

    public static double getTotalAmount() {
        return totalAmount;
    }
}