package com.devsuperior.dsvendas.dto

import java.io.Serializable
import java.time.LocalDate

data class SaleDTO(
    val id: Long,
    val visited: Int,
    val deals: Int,
    val amount: Double,
    val date: LocalDate,
    val seller: SellerDTO

) : Serializable