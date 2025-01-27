package org.hatice.inventoryandstockmanagementsystem.repository;

import org.hatice.inventoryandstockmanagementsystem.entity.Category;
import org.hatice.inventoryandstockmanagementsystem.entity.Warehouse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WareHouseRepository extends JpaRepository<Warehouse, Long> {

}