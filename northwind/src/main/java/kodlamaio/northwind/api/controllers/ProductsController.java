package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;

@RestController						// Android de iOS da seninle iletişim kurabilir
@RequestMapping("/api/products")	// kodlama.io/api/products olarak biri istek attığında 
public class ProductsController {		// ProductsController karşılık verecek
										
		
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {	// interface new lemesi ve business katmanından 
	super();													// ProductManagera erişim
	this.productService = productService;
}

	@GetMapping("/getall")					// kodlama.io/api/products/getall 
	public List<Product> getAll(){		
		return this.productService.getAll();
	}
	@PostMapping("/add")
	public Result add(Product product) {
		return new Result(true, "Ürün eklendi");
	}
}
