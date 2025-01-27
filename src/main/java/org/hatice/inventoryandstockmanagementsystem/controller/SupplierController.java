package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints;
import org.hatice.inventoryandstockmanagementsystem.service.SupplierService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.SUPPLIER)
@RequiredArgsConstructor
public class SupplierController {
	private final SupplierService supplierService;


}