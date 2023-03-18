import java.util.Scanner;


class test {
  public static void main(String[] args) {
    BankAccount UserAccount = new BankAccount();

    Scanner scnr = new Scanner(System.in);

    // prompt and read user input for first name
    System.out.print("Enter your first name: ");
    String firstName = scnr.nextLine();

    // prompt and read user input for last name
    System.out.print("Enter your last name: ");
    String lastName = scnr.nextLine();

    // prompt and read user input for accountID
    System.out.print("Enter your account #: ");
    int accountID = scnr.nextInt();

    // prompt and read user input for amount they want to deposit
    System.out.print("Enter the amount you want to deposit: ");
    double deposit = scnr.nextDouble();

    // prompt and read user input for widthdrawl
    System.out.print("Enter widthdrawl amount: ");
    double widthdrawl = scnr.nextDouble();

    UserAccount.setFirstName(firstName);
    UserAccount.setLastName(lastName);
    UserAccount.setAccountID(accountID);
    UserAccount.deposit(deposit);
    UserAccount.widthdrawl(widthdrawl);

    // print account info
    UserAccount.accountSummary();
  }
}