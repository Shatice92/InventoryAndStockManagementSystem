package org.hatice.inventoryandstockmanagementsystem.dto.request.productrequestdto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductSaveDto(@NotBlank String name,
                            @NotNull Long categoryId,
                            @NotNull Integer quantity,
                            @NotBlank String description,
                            @NotBlank String imageUrl,
                            @NotNull Long warehouseId,
                            @NotNull Long supplierId,
                            @NotNull BigDecimal purchasePrice,
                            @NotNull BigDecimal salePrice
                            ) {
}