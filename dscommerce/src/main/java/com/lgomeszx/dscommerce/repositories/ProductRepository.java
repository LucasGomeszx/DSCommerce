package com.lgomeszx.dscommerce.repositories;

import com.lgomeszx.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
