package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.CategoryRepository;
import org.hatice.inventoryandstockmanagementsystem.repository.WareHouseRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WarehouseService {
	private final WareHouseRepository wareHouseRepository;
	
	
}