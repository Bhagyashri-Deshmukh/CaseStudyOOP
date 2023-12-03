package oops;

public class BankOfIndia implements ReserveBankOfIndia {
	
	Customer customer;

	@Override
	public void statutoryRistrictions() {
		// TODO Auto-generated method stub
		System.out.println("Statutory Ristrictions should be followed by BOI");
	}

	@Override
	public void regulatoryRistrictions() {
		// TODO Auto-generated method stub
		System.out.println("Regulatory Ristrictions should be followed by BOI");
	}
	
	public void customerAccount(int accNumber, String accHolderName, String accTypeSaving) {
		
		customer= new Customer(accNumber,this.getClass().getSimpleName(),accTypeSaving,"Bhagyashri","Pune");
		
		System.out.println("Bank Name is :"+customer.getBankName());
		System.out.println("Account Number is : "+customer.getBankAccNumber());
		System.out.println("Account Holder Name is : "+customer.getCustomerName());
		System.out.println("Account Type is : "+customer.getCustomerAccType());
	}
	
	public void customerAccount(int accNumber, String accHolderName, String accTypeCurrent, String business) {
		
		customer= new Customer(accNumber,this.getClass().getSimpleName(),accTypeCurrent,"Bhagyashri","Pune",business);
		
		System.out.println("Bank Name is :"+customer.getBankName());
		System.out.println("Account Number is : "+customer.getBankAccNumber());
		System.out.println("Account Holder Name is : "+customer.getCustomerName());
		System.out.println("Account Type is : "+customer.getCustomerAccType());
		System.out.println("Account Type is : "+customer.getBusiness());
	}

}
