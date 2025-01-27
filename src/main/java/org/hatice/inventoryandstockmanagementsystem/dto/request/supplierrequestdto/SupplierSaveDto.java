package org.hatice.inventoryandstockmanagementsystem.dto.request.supplierrequestdto;

import jakarta.validation.constraints.NotBlank;

public record SupplierSaveDto(@NotBlank String name, @NotBlank String contactInfo, @NotBlank  String address) {
}