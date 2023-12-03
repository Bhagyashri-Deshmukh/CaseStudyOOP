package oops;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Following is example of dynamic polymorphism
		ReserveBankOfIndia reserveBankOfIndia;
		/*
		 * Calling a method over an object is abstraction where we only show the name of
		 * method and implementation is hidden
		 */
		reserveBankOfIndia = new StateBankOfIndia();
		reserveBankOfIndia.statutoryRistrictions();
		reserveBankOfIndia.regulatoryRistrictions();
		
		System.out.println("------------------------------------------------------");
		
		reserveBankOfIndia = new BankOfIndia();
		reserveBankOfIndia.statutoryRistrictions();
		reserveBankOfIndia.regulatoryRistrictions();
		
		System.out.println("----------------------------------------------------------------------------");
		
		// Following is example of static polymorphism
		StateBankOfIndia stateBankOfIndia = new StateBankOfIndia();
		stateBankOfIndia.customerAccount(1010, "Bhagyashri Deshmukh", "Saving");
		stateBankOfIndia.country();// This is inheritance.
		System.out.println("\n");
		stateBankOfIndia.customerAccount(1011, "Bhagyashri Deshmukh", "Current", "Hoteling");
		stateBankOfIndia.country();
		System.out.println("------------------------------------------------------");
		// Following is example of static polymorphism
		BankOfIndia bankOfIndia = new BankOfIndia();
		bankOfIndia.customerAccount(9010, "Bhagyashri Deshmukh", "Saving");
		bankOfIndia.country();// This is inheritance.
		System.out.println("\n");
		bankOfIndia.customerAccount(9011, "Bhagyashri Deshmukh", "Current", "Snaks");
		bankOfIndia.country();
	}

}
