import java.util.ArrayList;
import java.util.Scanner;

public class ControlAccountInfo {
    private String accountNumber = "0912345678";
    private String accountName = " Vu Manh Khoi";
    private double balance = 10000000;
    Scanner sc = new Scanner(System.in);
    ArrayList accountList = new ArrayList();

    public void displayAccountInfo() {
        AccountBankList accountBank = new AccountBankList(accountNumber, accountName, balance);
        System.out.println("Account Number: " + accountBank.getAccountNumber());
        System.out.println("Account Name: " + accountBank.getAccountName());
        System.out.println("Balance: " + accountBank.getBalance());
    }

    public void accountDeposit() {
        System.out.println("Enter the amount: ");
        Double amount = sc.nextDouble();
        balance = balance + amount;
        AccountBankList accountBank = new AccountBankList(accountNumber, accountName, balance);
        accountList.add(accountBank);
        System.out.println("Your remaining amount is :" + balance);
    }

    public void accountWithdraw() {

        System.out.println("Enter the amount: ");
        Double amount = sc.nextDouble();
        sc.nextLine();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            AccountBankList accountBank = new AccountBankList(accountNumber, accountName, balance);
            accountList.add(accountBank);
            System.out.println("Your remaining amount is :" + balance);
        }
    }

    public void Transfer() {
        System.out.println("Enter incoming account: ");
        String incomingAccount = sc.nextLine();
        System.out.println("Enter the amount: ");
        Double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            AccountBankList accountBank = new AccountBankList(accountNumber, accountName, balance);
            accountList.add(accountBank);
            System.out.println("Your account number" + accountNumber);
            System.out.println("The amount in your account is:" + balance);
            System.out.println("Your incoming account is :" + incomingAccount);
            System.out.println("The amount you transferred:" + amount);
        }
    }
}
