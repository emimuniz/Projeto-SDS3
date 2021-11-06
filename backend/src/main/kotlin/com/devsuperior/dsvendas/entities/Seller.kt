package com.devsuperior.dsvendas.entities

import javax.persistence.*

@Entity
@Table(name = "tb_sellers")
data class Seller(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val name: String,

    @OneToMany(mappedBy = "seller")
    val sale: List<Sale> = ArrayList()
)