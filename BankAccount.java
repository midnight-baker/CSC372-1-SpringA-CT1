/* 
=======================
Name: Ambar C. Castillo

Project Name: CSC372-CT1 
Option 1 -- Implementing a Superclass Bank Account

Project Purpose: Implementing a Superclass Bank Account

Algorithm Used: Inhertiance is used
to implement a checking account
class from a super Banking account class

Program Inputs:
--string firstName
--string lastName
--int accountID

Program Outputs:
--double balance

Program Limitations: ____

Program Errors: None

=======================
*/


import java.util.*;

class BankAccount {

  private string firstName;
  private string lastName;
  private int accountID;
  private double balance;

  // initialize balance to zero
  public BankAccount(){
    this.balance = 0.0;
  }

  // will accept a single value double parameter; the parameter value is added to
  // the existing balance
  public deposit(double amount){
    this.balance += amount;
  }

  // accepts a single value double dollar amount; the parameter value is
  // subtracted from the existing balance
  public withdrawal(double amount){
    if (amount > this.balance) {
      System.out.println("Insufficient funds!");
    } else {
      this.balance -= amount;
    }
  }

  // setter for firstName
  public setFirstName(String firstName){
    this.firstName = firstName;
  }

  // getter for firstName
  public String getFirstName() {
    return this.firstName;
  }

  // setter for lastName
  public setLastName(String lastName){
    this.lastName = lastName;
  }

  // getter for lastName
  public String getLastName() {
    return this.lastName;
  }

  // setter for accountID
  public setAccountID(int accountID){
    this.accountID = accountID;
  }

  // getter for accountID
  public int getAccountID() {
    return this.accountID;
  }

  // getter to return the balance
  public double getBalance() {
    return this.balance;
  }

  // prints all account information
  public void accountSummary() {
    System.out.println("Account Information:");
    System.out.println("Account Holder: " + this.firstName + " " + this.lastName);
    System.out.println("Account ID: " + this.accountID);
    System.out.println("Current Balance: $ " + this.balance);
  }
}