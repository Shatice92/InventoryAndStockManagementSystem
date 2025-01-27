package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints;
import org.hatice.inventoryandstockmanagementsystem.service.OrderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.ORDER)
@RequiredArgsConstructor
public class OrderController {
	private final OrderService orderService;
	
	
}