package oopIntro;

public class Main {

	public static void main(String[] args) {
		/*
		String[] products = {
				"Lenovo V14", ESK� US�L KULLANILMIYOR. 
				"Lenovo V15",
				"HP 5"
		};
		
		int[] unitsInStocks = {
				3,
				4,
				5
		};*/
		
		/*
		Product product1 =  new Product(); //Class'tan obje olu�turma. �rnek olu�turma, referans olu�turma, instance.
		Product product2 = new Product();
		Product product3 = new Product();
		
		
		product1.id = 1;
		product1.name = "Lenovo V14"; // Bir �r�n nesnesi olu�turduk.
		product1.unitPrice = 15000;
		product1.detail = "16 GB Ram";
		
		
		product2.id = 2;
		product2.name = "Lenovo V15"; 
		product2.unitPrice = 16000;
		product2.detail = "32 GB Ram";
		
		product3.id = 3;
		product3.name = "HP 5"; 
		product3.unitPrice = 10000;
		product3.detail = "8 GB Ram";
		*/
		Product product1 = new Product(1,"Lenovo V14",15000,"16 GB Ram");
		Product product2 = new Product(2,"Lenovo V15",16000,"32 GB Ram");
		Product product3 = new Product(3,"HP 5",10000,"8 GB Ram");
		
		Product[] products = {
				product1,
				product2,
				product3
		};
		
		for(Product product:products) {
			System.out.println(product.name);
		}
		
		System.out.println(products.length);
		
		//Category olu�turma
		
		Category category1 = new Category();
		Category category2 = new Category();
		
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		category2.id = 2;
		category2.name = "Ev/Bah�e";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);//data g�ndermemiz laz�m.
		productManager.addToCart(product2);
		productManager.addToCart(product3);
	}

}
