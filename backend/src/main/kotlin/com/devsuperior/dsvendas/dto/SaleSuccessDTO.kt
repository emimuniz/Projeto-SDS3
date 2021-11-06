package com.devsuperior.dsvendas.dto

import java.io.Serializable


data class SaleSuccessDTO(
    val sellerName: String,
    val visited: Long,
    val deals: Long
) : Serializable


