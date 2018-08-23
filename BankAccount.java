package com.day3;

public class BankAccount {
	private long accid;
	private String accHolderName;
	private String accType;
	private double balance;
	private Object String;
	

	public BankAccount() {
	}
	
public BankAccount(long accid,String accHolderName,String accType,double balance) {
	this.accid = accid; 
	this.accHolderName = accHolderName;
	this.accType = accType;
	this.balance = balance;
}

public double Withdraw(double amount) {
	if(balance - amount >= 0)
		balance = balance-amount;
	else
		System.out.println("You dont have sufficient balance");
	return balance;
}
public double Deposit(double amount) {
	balance = balance+amount;
	return balance;
	
}
public double getBalance() {
	return balance;
}

public void displayBankAccountDetails() {
	System.out.println("accountid:"+accid + "\nAccountholdername" +accHolderName + "\nAccountType" + accType + "\nAccountbalance " + balance);
}
public static long totalBankAccounts() {
	return totalBankAccounts();

}


}

