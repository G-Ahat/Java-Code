package day33_ClassesObjects_Constructors;

public class BankAccount {
	
	double balance;
	
	//this constructor sets the starting balance at 0.0
	
	public BankAccount() {
		balance=0.0;
		}
	//this constructor sets the starting balance to the value passes as an argument
	
	public BankAccount(double startBalance) {
		balance=startBalance;
	}
	////This constructor sets the starting balance to the value in the String argument
	public BankAccount(String str) {
		balance=Double.parseDouble(str);
	}
	
	//Deposit method makes a deposit into account
	 public void deposit(double amount) {
		 balance=balance+amount;
	 }
	 
	//Deposit method makes a deposit into account
	 public void deposit(String str) {
		 balance=balance+Double.parseDouble(str);
	 }
	
	//get balance
	 public double getBalance() {
		return balance;
	 }
	

}
