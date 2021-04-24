package oopIntro;

public class Product {
		
	public Product() {	//constructor - yap�c� bloklar.
		System.out.println("ben cal�st�m");
	}
	
	// Bir constructor cal�smak zorunda. Birden fazla constructor varsa sadece biri �al���r. Bu yap�da yazarsak e�er.
	public Product(int id,String name,double unitPrice, String detail) {
		this();//Bu class'�n parametresiz olan�n� �al��t�r demektir.
		this.id = id; // this -> bu class'taki id anlam�nda kullan�l�r.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
