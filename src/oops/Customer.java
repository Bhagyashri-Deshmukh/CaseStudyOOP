package oops;

public class Customer {

	private int bankAccNumber;
	private String bankName;
	private String customerAccType;
	private String customerName;
	private String customerAddress;
	private String business;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int bankAccNumber, String bankName, String customerAccType, String customerName,
			String customerAddress) {
		super();
		this.bankAccNumber = bankAccNumber;
		this.bankName = bankName;
		this.customerAccType = customerAccType;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
	}
	
	public Customer(int bankAccNumber, String bankName, String customerAccType, String customerName,
			String customerAddress, String business) {
		super();
		this.bankAccNumber = bankAccNumber;
		this.bankName = bankName;
		this.customerAccType = customerAccType;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.business = business;
	}

	// Here we have written getter setter to ensure encapsulation
	public int getBankAccNumber() {
		return bankAccNumber;
	}

	public void setBankAccNumber(int bankAccNumber) {
		this.bankAccNumber = bankAccNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getCustomerAccType() {
		return customerAccType;
	}

	public void setCustomerAccType(String customerAccType) {
		this.customerAccType = customerAccType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getBusiness() {
		return business;
	}

	public void setBusiness(String business) {
		this.business = business;
	}

	@Override
	public String toString() {
		return "Customer [bankAccNumber=" + bankAccNumber + ", bankName=" + bankName + ", customerAccType="
				+ customerAccType + ", customerName=" + customerName + ", customerAddress=" + customerAddress
				+ ", business=" + business + "]";
	}
}
