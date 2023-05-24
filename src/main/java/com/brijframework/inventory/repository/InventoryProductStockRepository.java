package com.brijframework.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brijframework.inventory.model.global.EOGlobalProductStock;

@Repository
public interface InventoryProductStockRepository extends JpaRepository<EOGlobalProductStock, Long> {

}
