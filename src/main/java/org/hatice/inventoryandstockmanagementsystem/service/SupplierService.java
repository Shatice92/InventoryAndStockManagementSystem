package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.CategoryRepository;
import org.hatice.inventoryandstockmanagementsystem.repository.SupplierRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SupplierService {
	private final SupplierRepository supplierRepository;
	
}