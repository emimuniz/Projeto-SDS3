package com.devsuperior.dsvendas.repository

import com.devsuperior.dsvendas.entities.Seller
import org.springframework.data.jpa.repository.JpaRepository

interface SellerRepository : JpaRepository<Seller, Long>{

}