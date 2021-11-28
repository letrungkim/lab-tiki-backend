package rmit.rmitsb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rmit.rmitsb.model.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
