package nLayeredDemo.dataAccess.abstracts;

import java.util.*;
import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {//veri eriþim kodlarýmýzý yazacaðýz.
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}
