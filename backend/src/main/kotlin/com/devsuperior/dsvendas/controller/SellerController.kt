package com.devsuperior.dsvendas.controller

import com.devsuperior.dsvendas.dto.SellerDTO
import com.devsuperior.dsvendas.service.SellerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/sellers")
class SellerController(private val service: SellerService) {

    @GetMapping
    fun findAll() : ResponseEntity<List<SellerDTO>>{
        val list = service.findAll()
        return ResponseEntity.ok(list)
    }
}