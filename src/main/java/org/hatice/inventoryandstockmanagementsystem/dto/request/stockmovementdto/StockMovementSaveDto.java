package org.hatice.inventoryandstockmanagementsystem.dto.request.stockmovementdto;

import jakarta.validation.constraints.NotNull;
import org.hatice.inventoryandstockmanagementsystem.enums.MovementType;

public record StockMovementSaveDto(@NotNull Long productId, @NotNull MovementType movementType,
                                   @NotNull Integer quantity, @NotNull Long userId) {
}