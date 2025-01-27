package org.hatice.inventoryandstockmanagementsystem.repository;

import org.hatice.inventoryandstockmanagementsystem.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {

}