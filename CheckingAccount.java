import BankAccount.java;

class CheckingAccount extends BankAccount {
  private double interestRate;
  // private double overdraftFee = 30.00;

  // 
  public CheckingAccount(){
    super();
    this.interestRate = 0.0;
  }

  // set interestRate
  public setInterestRate(double interestRate){
    this.interestRate = interestRate;
  }

  // get interestRate
  public getInterestRate() {
    return this.interestRate;
  }
  
  // Allows overdraft withdrawals and charges a $30 fee
  public processWithdrawl(double amount) {
    if (amount > this.getBalance()) {
      System.out.println("Warning: Overdraft!");
      double overdraftAmount = amount - this.getBalance() + 30.0;
      System.out.println("Withdrawal amount: $" + amount);
      System.out.println("Overdraft fee: $30.0");
      System.out.println("Overdraft amount: $" + overdraftAmount);
      this.balance -= overdraftAmount;
    } else {
      this.balance -= amount;
    }
  }

  
  // will display a negative balance that includes a $30 overdraft fee and denotes that a fee has been accessed
  public processWithdrawal() {
    
  }

  // should display all superclass attributes and provides an additional interest rate
  public void displayAccount() {
    System.out.println("Account Information:");
    System.out.println("Name: " + this.getFirstName() + " " + this.getLastName());
    System.out.println("Account ID: " + this.getAccountID());
    System.out.println("Balance: $" + this.getBalance());
    System.out.println("Interest Rate: " + this.interestRate);
  }
}