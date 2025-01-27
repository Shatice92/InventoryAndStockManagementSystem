package org.hatice.inventoryandstockmanagementsystem.service;

import lombok.RequiredArgsConstructor;
import org.hatice.inventoryandstockmanagementsystem.repository.CategoryRepository;
import org.hatice.inventoryandstockmanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
	private final UserRepository userRepository;
	
}