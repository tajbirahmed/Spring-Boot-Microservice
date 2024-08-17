package com.techie.microservices.inventory.service;

import com.techie.microservices.inventory.repository.InventoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public boolean isInStock(
            String skuCode,
            Integer quantity
    ) {
        // find the quantity of a given sku_code where quantity >= 0
        return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
    }
}
