package net.helmi.springobservabilitygrafana.repository;

import net.helmi.springobservabilitygrafana.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
