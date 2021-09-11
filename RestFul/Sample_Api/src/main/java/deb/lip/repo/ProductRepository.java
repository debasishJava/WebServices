package deb.lip.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import deb.lip.bindings.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

	List<Product> findByProductId(Integer productId);
}
