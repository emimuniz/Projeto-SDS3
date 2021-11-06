package com.devsuperior.dsvendas.controller

import com.devsuperior.dsvendas.dto.SaleDTO
import com.devsuperior.dsvendas.service.SaleService
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Page
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sales")
class SaleController(private val service: SaleService) {

    @GetMapping
    fun findAll(paginacao: Pageable): Page<SaleDTO>{
        return service.findAll(paginacao)
    }
}