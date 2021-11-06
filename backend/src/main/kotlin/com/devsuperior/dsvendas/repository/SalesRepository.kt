package com.devsuperior.dsvendas.repository

import com.devsuperior.dsvendas.entities.Sale
import org.springframework.data.jpa.repository.JpaRepository

interface SalesRepository : JpaRepository<Sale, Long>{

}