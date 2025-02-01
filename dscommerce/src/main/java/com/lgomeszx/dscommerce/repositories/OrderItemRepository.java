package com.lgomeszx.dscommerce.repositories;

import com.lgomeszx.dscommerce.entities.Order;
import com.lgomeszx.dscommerce.entities.OrderItem;
import com.lgomeszx.dscommerce.entities.OrderItemPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

}
