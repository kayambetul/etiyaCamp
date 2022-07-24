package inheritanceDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		BaseKrediManager[] baseKrediManagers=new BaseKrediManager[] { new OgretmenKrediManager(),new TarimKrediManager(),new AskerKrediManager()};
		for (BaseKrediManager baseKrediManager : baseKrediManagers) {
			System.out.println( baseKrediManager.hesapla(1000));
		}
	
		/*OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
		System.out.println( ogretmenKrediManager.hesapla(1000));*/
		
		/*KrediUI krediUI=new KrediUI();
		krediUI.krediHesapla(new AskerKrediManager());*/

	}

}
