
public class BankAccount {

	//Instance variables
	private double balance;
	private String accountNumber;
	private Customer accountHolder;
	
	//Constructors
	public BankAccount() {
	}

	public BankAccount(double balancein) {
		this.balance=balancein;
	}
	public BankAccount(double balancein, String accountNumb) {
		this.balance=balancein;
		this.accountNumber=accountNumb;
	}
	public BankAccount(Customer accountH, double balancein) {
		this.balance=balancein;
		accountHolder.setName(accountH.getName());
		accountHolder.setID(accountH.getID());
	}
	public BankAccount(double balancein, Customer accountH) {
		accountHolder.setName(accountH.getName());
		accountHolder.setID(accountH.getID());
		this.balance=balancein;
	}


	BankAccount(BankAccount account){
		balance=account.getBalance();
		accountNumber=account.getAccountNumber();
		accountHolder=account.getAccountHolder();
	}
	
	
	//Get and Set Methods

	public double getBalance() {
		return new Double(balance);
	}
	public void  setBalance(double balance) {
		this.balance=balance;
	}

	public String getAccountNumber() {
		return new String(accountNumber);
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public Customer getAccountHolder() {
		return new Customer(accountHolder);
	}
	public void setAccountHolder(Customer accountHolder) {
		this.accountHolder=accountHolder;
	}
		

	public String toString() {
		return String.format("(%s)%s: %s",accountHolder, accountNumber, balance);
	}

	//Mutator Methods

	public void deposit(double amount) {
		if (amount>=0) {
			balance=balance+amount;
		}
	}

	public void withdraw(double amount) {
		if (amount<=balance && amount >=0) {
			balance=balance-amount;
		}
	}
	public void transfer(int amount, BankAccount account) {
		if ((balance-amount)>=0) {
			balance=balance-amount;
			account.balance=balance+amount;
			
			}
	}
}




