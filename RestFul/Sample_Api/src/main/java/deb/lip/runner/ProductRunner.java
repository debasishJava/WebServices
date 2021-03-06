package deb.lip.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import deb.lip.bindings.Product;
import deb.lip.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository pRepo;
	
	@Override
	public void run(String... args) throws Exception {
		pRepo.saveAll(
				
				List.of( 
						 new Product(1011,"Unilever",245.90),
						 new Product(1012,"Hindustan",945.90),
						 new Product(1013,"Tata",745.90),
						 new Product(1014,"Lotus",545.90),
						 new Product(1015,"Mankind",445.90),
						 new Product(1016,"Sun",345.90),
						 new Product(1017,"Baja",145.90)
					)
						   
				);

	}

}
