package com.devsuperior.dsvendas.repository

import com.devsuperior.dsvendas.dto.SaleSumDTO
import com.devsuperior.dsvendas.dto.SaleSuccessDTO
import com.devsuperior.dsvendas.entities.Sale
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface SaleRepository : JpaRepository<Sale, Long>{

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.seller.name, SUM(obj.amount)) " +
            "  FROM Sale AS obj GROUP BY obj.seller.name")
    fun amountGroupedBySeller(): List<SaleSumDTO>

    @Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.seller.name, SUM(obj.visited), SUM(obj.deals)) " +
            "  FROM Sale AS obj GROUP BY obj.seller.name")
    fun sucessGroupedBySeller(): List<SaleSuccessDTO>

}