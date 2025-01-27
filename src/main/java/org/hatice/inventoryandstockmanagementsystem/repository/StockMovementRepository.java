package org.hatice.inventoryandstockmanagementsystem.repository;

import org.hatice.inventoryandstockmanagementsystem.entity.Category;
import org.hatice.inventoryandstockmanagementsystem.entity.StockMovement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockMovementRepository extends JpaRepository<StockMovement, Long> {

}