package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.CategoryRepository;
import org.hatice.inventoryandstockmanagementsystem.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {
	private final ProductRepository productRepository;
	
	
}