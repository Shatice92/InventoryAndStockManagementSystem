package org.hatice.inventoryandstockmanagementsystem.repository;

import org.hatice.inventoryandstockmanagementsystem.entity.Category;
import org.hatice.inventoryandstockmanagementsystem.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}