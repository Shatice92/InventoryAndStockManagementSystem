package org.hatice.inventoryandstockmanagementsystem.controller;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.constant.Endpoints;
import org.hatice.inventoryandstockmanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(Endpoints.USER)
@RequiredArgsConstructor
public class UserController {
	private final UserService userService;
	
}