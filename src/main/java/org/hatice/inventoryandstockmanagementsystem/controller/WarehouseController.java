package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints;
import org.hatice.inventoryandstockmanagementsystem.service.WarehouseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.WAREHOUSE)
@RequiredArgsConstructor
public class WarehouseController {
	private final WarehouseService warehouseService;
	
	
}