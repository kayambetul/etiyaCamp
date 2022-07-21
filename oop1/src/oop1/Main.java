package oop1;

public class Main {

	public static void main(String[] args) {
		
		Category category1=new Category();
		category1.setId(1);
		category1.setName("Programlama");
		
		Instructor instructor1=new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setBranch("Java");
		
		Course course1=new Course();
		course1.setId(1);
		course1.setName("Java");
		course1.setPercentageOfProgress(90);
		course1.setCategory(category1);
		course1.setInstructor(instructor1);
		
		
		System.out.println(course1.getName()+"  "+course1.getCategory().getName()+"  "+course1.getInstructor().getFirstName());
		
		/*Product product1=new Product();
		product1.setId(1);
		product1.setName("Elma");
		product1.setUnitPrice(50);
		product1.setCategory(category1);
		
		Product product2=new Product();
		product2.setId(2);
		product2.setName("Kuru fasulye");
		product2.setUnitPrice(60);
		product2.setCategory(category2);
		
		System.out.println(product1.getName());
		System.out.println(product1.getUnitPrice());
		System.out.println(product1.getDiscountedPrice());
		
		System.out.println(product1.getCategory().getName());*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	Product product1=new Product();
		product1.id=1;
		product1.name="volley ball";
		product1.unitPrice=1750;
		
		Product product2=new Product();
		product1.id=1;
		product1.name="volley ball2";
		product1.unitPrice=1750;
		
		Product product3=new Product();
		product1.id=1;
		product1.name="volley ball3";
		product1.unitPrice=1750;
		
		Product[] products=new Product[] {product1,product2,product3};
		product2=product1;
		product1=product3;
		product1.name="elma";
		System.out.println(products[0].name);
		
*/
	}

}
