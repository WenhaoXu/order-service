package com.dmall.orderservice.adapter.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(value = "inventory-service")
public interface InventoryClient {
    @PostMapping(value = "/inventories/lock")
    String lock(Lock lock);
   @PutMapping(value = "/inventories/lock/{lockId}")
    void unlock(@PathVariable("lockId") String lockId);
}
