package com.lgomeszx.dscommerce.repositories;

import com.lgomeszx.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
