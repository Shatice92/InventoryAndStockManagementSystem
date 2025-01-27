package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints.*;
import org.hatice.inventoryandstockmanagementsystem.service.CategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.CATEGORY)
@RequiredArgsConstructor
public class CategoryController {
	private final CategoryService categoryService;
	
}