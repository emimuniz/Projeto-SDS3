package com.devsuperior.dsvendas.dto

import java.io.Serializable


data class SaleSumDTO(
    val sellerName: String,
    val sum: Double
) : Serializable


