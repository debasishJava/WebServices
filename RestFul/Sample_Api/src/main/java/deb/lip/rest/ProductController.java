package deb.lip.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import deb.lip.bindings.Product;
import deb.lip.repo.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository pRepo;

	//getting product according to id
	@GetMapping(
			value = "/product/{id}",
			produces = "application/json"
			)
	public ResponseEntity<Product> getProductById(@PathVariable(name = "id") Integer id){
		//getting product by id
		List<Product> list=pRepo.findByProductId(id);
		//getting the list item at index 0- product obj
		Product prod=list.get(0);
		//setting prod obj and http status
		ResponseEntity<Product> res=new ResponseEntity<Product>(prod, HttpStatus.OK);
		//returning the final res
		return res;
	}
	
	//getting all products
	@GetMapping(
			value = "/products",
			produces = "application/json"
			)
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> listProd=pRepo.findAll();
		
		ResponseEntity<List<Product>> res = new ResponseEntity<>(listProd,HttpStatus.OK);
		
		return res;
	}
}
