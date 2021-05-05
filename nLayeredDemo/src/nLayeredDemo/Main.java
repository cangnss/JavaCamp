package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {//entityler hari� new lersek s�k�nt� ya�ar�z.
		
		//ToDo: Spring IoC ile ��z�lecek.
		//ProductService productService = new ProductManager(new HibernateProductDao());
		//ProductService productService2 = new ProductManager(new AbcProductDao());
		ProductService productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		//productService2.add(product);
	}

}
