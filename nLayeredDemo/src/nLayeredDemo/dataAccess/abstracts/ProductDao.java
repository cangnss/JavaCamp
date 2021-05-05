package nLayeredDemo.dataAccess.abstracts;

import java.util.*;
import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {//veri eri�im kodlar�m�z� yazaca��z.
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);
	List<Product> getAll();
}
