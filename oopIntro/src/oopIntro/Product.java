package oopIntro;

public class Product {
		
	public Product() {	//constructor - yapýcý bloklar.
		System.out.println("ben calýstým");
	}
	
	// Bir constructor calýsmak zorunda. Birden fazla constructor varsa sadece biri çalýþýr. Bu yapýda yazarsak eðer.
	public Product(int id,String name,double unitPrice, String detail) {
		this();//Bu class'ýn parametresiz olanýný çalýþtýr demektir.
		this.id = id; // this -> bu class'taki id anlamýnda kullanýlýr.
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
