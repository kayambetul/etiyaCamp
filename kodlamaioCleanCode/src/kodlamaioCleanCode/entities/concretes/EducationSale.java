package kodlamaioCleanCode.entities.concretes;

public class EducationSale {
	private int id;
	private String name;
	private double sale;
	
	
	public EducationSale() {
		super();
	}
	
	
	public EducationSale(int id, String name, double sale) {
		super();
		this.id = id;
		this.name = name;
		this.sale = sale;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSale() {
		return sale;
	}
	public void setSale(double sale) {
		this.sale = sale;
	}
	
	

}
