package opp2;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int nationalIdentity;
	public Customer() {
		super();
	}
	public Customer(int id, String firstName, String lastName, int nationalIdentity) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(int nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	

}
