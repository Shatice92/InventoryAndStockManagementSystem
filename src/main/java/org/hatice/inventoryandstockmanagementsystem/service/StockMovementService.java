package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.CategoryRepository;
import org.hatice.inventoryandstockmanagementsystem.repository.StockMovementRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StockMovementService {
	private final StockMovementRepository stockMovementRepository;
	
}