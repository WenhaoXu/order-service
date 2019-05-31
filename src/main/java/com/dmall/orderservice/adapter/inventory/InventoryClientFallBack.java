package com.dmall.orderservice.adapter.inventory;

import org.springframework.stereotype.Component;

/**
 * @author Howells
 * @DATE 05/31/2019
 */
@Component
public class InventoryClientFallBack implements InventoryClient{
    @Override
    public String lock(Lock lock) {
        return "aafafaff";
    }

    @Override
    public void unlock(String lockId) {

    }
}
