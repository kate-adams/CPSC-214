public class Customer{
	
	//Instance Variables
	 private String name;
	 private int customerID;

	
	//Constructors
	public Customer() {
		this("",0);
	}
	
	public Customer(String name, int customerID) {
		this.name= name;
		this.customerID=customerID;
	}
	
	//Copy constructor
	public Customer(Customer cust) {
		name= cust.getName();
		customerID=cust.getID();
	}

		
	
	// Getter and setter methods
	public String getName(){
		return new String (name);
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getID() {
		return new Integer (customerID); 
	}
	public void setID(int customerID) {
		this.customerID=customerID;
	}
	//to String Method
	public String toString() {
		return String.format("%s %s",name, customerID);		
	}
}


