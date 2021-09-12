package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.dataAccess.abstracts.ProductDao;
import kodlamaio.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;						// geçici bir alan oluşturduk
	
	@Autowired											// interfaceler newlenemedikleri için bunu kullanırız
	public ProductManager(ProductDao productDao) {		// constructor injection : veriye erişim sağlıyoruz
		super();
		this.productDao = productDao;					// geçici alana db dekileri referans olarak atadık 
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return this.productDao.findAll();
	}

}
