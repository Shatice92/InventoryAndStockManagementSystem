package org.hatice.inventoryandstockmanagementsystem.dto.request.stockmovementdto;

import jakarta.validation.constraints.NotNull;
import org.hatice.inventoryandstockmanagementsystem.enums.MovementType;

public record StockMovementUpdateDto(@NotNull MovementType movementType, @NotNull Integer quantity, @NotNull Long productId) {
}