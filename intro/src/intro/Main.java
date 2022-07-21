package intro;

public class Main {

	public static void main(String[] args) {
/*		
	//bölen bölüneni belirtmek için 	
		for(int i=2;i<=1000;i++) {
			int sayac=0;
			for(int j=2;j<=(i/2);j++) {      
				if(i%j==0) {
					sayac=1;
					
				}
			}
			if(sayac==0) {
				System.out.println(i);
			}
		}*/
		
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


