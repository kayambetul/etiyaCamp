package kodlamaioCleanCode.entities.concretes;

public class Customer extends Person {
	
	private int cityId;

	public Customer() {
		super();
	}

	public Customer(int cityId) {
		super();
		this.cityId = cityId;
	}
	public Customer(int id, String firstName, String lastName, String identityNumber, int yearOfBirth,int cityId) {
        super(id, firstName, lastName, identityNumber, yearOfBirth);
        this.cityId = cityId;
    }

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
	
	
	
	
	


	

}
