package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RoleService {
	private final RoleRepository roleRepository;
	
	
}