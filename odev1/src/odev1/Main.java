package odev1;

public class Main {

	public static void main(String[] args) {
		
		
		
	/*	 String[][] sehirler = new String[3][3];

	        sehirler[0][0] = "İstanbul";
	        sehirler[0][1] = "Bursa";
	        sehirler[0][2] = "Bilecik";
	        sehirler[1][0] = "Ankara";
	        sehirler[1][1] = "Konya";
	        sehirler[1][2] = "Kayseri";
	        sehirler[2][0] = "Diyarbakır";
	        sehirler[2][1] = "Şanlıurfa";
	        sehirler[2][2] = "Gaziantep";

	        for (int i = 0; i<=2;i++){
	            System.out.println("------------");
	            for (int j = 0; j<=2;j++){
	                System.out.println(sehirler[i][j]);
	            }
	        }*/
	
		//-------------------------------------------------------------
		
		
		//mükemmel sayı
		
		/*
		int number = 6;
		int total = 0;
		
		for(int i=1;i<number;i++) {
			if(number % i == 0) {
				total = total + i;
			}
		}
		
		if (total == number) {
			System.out.println("Mükemmel Sayıdır");
		}else {
			System.out.println("Mükemmel Sayı Değildir");
		}
*/
		
		
		//------------------------------------------------------------------------
		
	//arkadaş sayı 
		
	/*	int sayi1=284;
		int sayi2=220;
		int toplam1=0;
		int toplam2=0;
		
		for(int i=1;i<sayi1;i++) {
			if(sayi1%i==0) {
				toplam1 = toplam1 +i;
			}
		}
		
		for(int i=1;i<sayi2;i++) {
			if(sayi2%i==0) {
				toplam2 = toplam2 +i;
			}
		}
		if (sayi1 == toplam2 && sayi2 == toplam1) {
			System.out.println("Bu İki Sayı Arkadaştır");
		}else {
			System.out.println("Bu İki Sayı Arkadaş Değilidir");
		}*/
		
		
//------------------------------------------------------------------------------
		
		
		//Kalın Sesli ve İnce Sesli Harfler
		/*
		char harf = 'E';
		
		switch(harf) {
			case 'A':
			case 'I':
			case 'O':
			case 'U':
				System.out.println("Kalın sesli harf");
				break;
				
			case 'E':
			case 'İ':
			case 'Ö':
			case 'Ü':
				System.out.println("İnce sesli harf");
				break;
		}*/
		
		
	//----------------------------------------------------------------------	
		
		//sayı bulma
		/*
		int [] numbers = {1,3,7,9};
		int numberToFound = 5;
		boolean isPresent = false;
		
		for (int number : numbers) {
			if (number == numberToFound) {
				isPresent = true;
				break;
			}
		}
		
		if(isPresent) {
			System.out.println("Sayı mevcuttur.");
		}else {
			System.out.println("Sayı mevcut değildir.");
		}
*/
		
		//-------------------------------------------------------------------------
		
		
		//dizidekş max bulma
	/*	
		int[] numbers = { 3, 10, 7, 22, 18 };
		int total = 0;
		int max = numbers[0];

		for(int number:numbers)
		{
			if (max < number) {
				max = number;
			}
			total = total + number;
		}
		
		System.out.println("Toplam : " + total);
		System.out.println("En Büyük : " + max);
*/	
		
		//-----------------------------------------------------------------------
		
		
		
		//asal sayı bulma
				for(int i=2;i<1000;i++) {
					int count =0; 
					for(int j=2;j<=(i/2);j++) {
					
						if(!isPrimeNumber( i,j))
							count++;
					
					}
					writePrimeNumber(count, i);
				}
				
			}
			
				static boolean isPrimeNumber(int i,int j) {
					if(i%j==0) {
						return false;
					}
					return true;
				}
				
				static void writePrimeNumber(int count,int i) {
					if(count==0) {
						System.out.println(i);
					}
				}
		
	}
	
	
		


