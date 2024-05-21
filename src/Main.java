import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<AccountBank> accountBanks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Account Bank");
        System.out.println("Please enter your account number:");
        String accountNumber = scanner.nextLine();
        System.out.println("Please enter your account holder name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Please enter your balance:");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        AccountBank accountBank = new AccountBank();
        accountBanks.add(accountBank);
        accountBank.setAccountHolderName(accountHolderName);
        accountBank.setAccountNumber(accountNumber);
        accountBank.setBalance(balance);
        // Test display
        System.out.println("--------------------");
        System.out.println("Test Display Account Info ");
        accountBank.displayAccountInfo(accountNumber, accountHolderName, balance);
        // Test deposit
        System.out.println("--------------------");
        System.out.println("Test deposit method");
        double deposit = scanner.nextDouble();
        System.out.println("Deposit amount: " + deposit);
        accountBank.deposit(deposit);
        System.out.println("Your account balance is: " + accountBank.getBalance());
        // Test withdraw
        System.out.println("--------------------");
        System.out.println("Test withdrawal method");
        double withdrawal = scanner.nextDouble();
        System.out.println("Withdrawal amount: " + withdrawal);
        accountBank.withdraw(withdrawal);
        System.out.println("Your account balance is: " + accountBank.getBalance());
        //Test transfer
        System.out.println("--------------------");
        System.out.println("Test transfer method");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setAccountHolderName("Vũ");
        destinationAccountBank.setAccountNumber("2345");
        destinationAccountBank.setBalance(20000);
        accountBanks.add(destinationAccountBank);
        accountBanks.add(accountBank);
        destinationAccountBank.displayAccountInfo(accountNumber, accountHolderName, balance);
        scanner.nextLine();
        System.out.println("Enter the transfer account number");
        String transferAccountNumber = scanner.nextLine();
        System.out.println("Enter transfer amount");
        double transfer = scanner.nextDouble();
        accountBank.transfer(transferAccountNumber, transfer);
        System.out.println("My account: " + accountBank.getBalance());
        System.out.println("Destination account :" + destinationAccountBank.getBalance());
    }
}
