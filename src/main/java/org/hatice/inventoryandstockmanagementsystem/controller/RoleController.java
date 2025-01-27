package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.service.RoleService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hatice.inventoryandstockmanagementsystem.constant.Endpoints.*;

@RestController
@RequestMapping (ROLE)
@RequiredArgsConstructor
public class RoleController {
	private final RoleService roleService;
	
}