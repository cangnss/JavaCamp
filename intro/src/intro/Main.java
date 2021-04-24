package intro;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		//camelCase
		//Don't repeat yourself
		String internetSubeButonu = "Ýnternet Þubesi";
		//Sayýsal veri tipleri
		double dolarDun = 8.15;
		double dolarBugun = 8.15;
		int vade = 36;
		boolean dustuMu = false;
		
		if(dolarDun<dolarBugun) {
			dustuMu=true;
			System.out.println("Dolar yükseldi.");
		}
		else if(dolarDun==dolarBugun) {
			System.out.println("Dolar eþit.");
		}else {
			dustuMu=false;
			System.out.println("Dolar düþtü.");
		}
		
		String kredi1 = "Hýzlý kredi";
		String kredi2 = "Mutlu emekli kredisi";
		String kredi3 = "Konut kredisi";
		String kredi4 = "Çiftci kredisi";
		String kredi5 = "Msb kredisi";
		String kredi6 = "Meb kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);

		String[] krediler = {"Hýzlý kredi","Mutlu emekli kredisi","Konut kredisi","Çiftci kredisi","Msb kredisi","Meb kredisi"};
		
		/*for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}*/
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);//20
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		
		String sehir1 = "Ankara";
		String sehir2 = "Ýstanbul";
		sehir1 = sehir2;
		sehir2 = "Ýzmir";
		System.out.println(sehir1);
		
		
		//System.out.println(internetSubeButonu);
		//System.out.println("Hello world!");
	}

}
