package org.hatice.inventoryandstockmanagementsystem.repository;

import org.hatice.inventoryandstockmanagementsystem.entity.Category;
import org.hatice.inventoryandstockmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}