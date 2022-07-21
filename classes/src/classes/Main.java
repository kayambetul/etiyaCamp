package classes;

public class Main {

	public static void main(String[] args) {
		

		CustomerManager customerManager=new CustomerManager();
		CustomerManager customerManager2=new CustomerManager();
		customerManager=customerManager2;
		customerManager.add();
		customerManager.remove();
		customerManager.update();
		
		//value /referance type
		
		int sayi1=10;
		int sayi2=20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2); //10
		//value değer atanır ve bağlantı kopar
		
		int[] sayilar1=new int[] {1,2,3};
		int[] sayilar2=new int[] {4,5,6};
		sayilar1=sayilar2;
		sayilar1[0]=10;
		System.out.println(sayilar2[0]); //10
		//referance adres tutulur bağlantı devam eder.
	}

}

//classlar == ortak operasyonları tutar referance tiptir.
