public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public void displayAccountInfo(String accountNumber, String accountHolderName, double balance) {
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Account Holder Name: " + this.accountHolderName);
        System.out.println("Balance: " + this.balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("Amount can't be negative");
            return;
        } else {
            this.balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("Amount can't be negative");
            return;
        }
        if (amount > balance) {
            System.err.println("Insufficient balance");
            return;
        } else {
            this.balance -= amount;
        }
    }

    public void transfer(String destinationAccountNumber, double amount) {

        if (amount <= 0) {
            System.err.println("Amount can't be negative");
            return;
        }
        if (amount > balance) {
            System.err.println("Insufficient balance");
            return;
        }
        int destinationAccountIdex = -1;
        for (int i = 0; i < Main.accountBanks.size(); i++) {
            AccountBank destinationAccountBank = Main.accountBanks.get(i);
            if (destinationAccountBank.getAccountNumber().equals(destinationAccountNumber)) {
                destinationAccountIdex = i;
            }
        }
        if (destinationAccountIdex == -1) {
            System.err.println("No such account number");
        }
        balance -= amount;
        AccountBank destinationAccount = Main.accountBanks.get(destinationAccountIdex);
        destinationAccount.setBalance(destinationAccount.balance + amount);
    }

    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
