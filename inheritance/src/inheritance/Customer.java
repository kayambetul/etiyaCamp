package inheritance;

public class Customer extends Person{
	private String email;

	
	public Customer() {
		super();
	}


	public Customer(String email) {
		super();
		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
