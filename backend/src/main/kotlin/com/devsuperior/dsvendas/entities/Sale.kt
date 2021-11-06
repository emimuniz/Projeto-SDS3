package com.devsuperior.dsvendas.entities

import java.time.LocalDate
import javax.persistence.*

@Entity
@Table(name = "tb_sales")
data class Sale(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val visited: Int,
    val deals: Int,
    val amount: Double,
    val date: LocalDate,

    @ManyToOne()
    @JoinColumn(name = "seller_id")
    val seller: Seller
)