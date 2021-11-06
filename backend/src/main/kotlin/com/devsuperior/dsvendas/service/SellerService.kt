package com.devsuperior.dsvendas.service

import com.devsuperior.dsvendas.dto.SellerDTO
import com.devsuperior.dsvendas.entities.Seller
import com.devsuperior.dsvendas.mapper.SellerMapper
import com.devsuperior.dsvendas.repository.SellerRepository
import org.springframework.stereotype.Service
import java.util.stream.Collectors


@Service
class SellerService(
    private val repository: SellerRepository,
    private val sellerMapper: SellerMapper
) {

    fun findAll() :   List<SellerDTO> {
        val result = repository.findAll()
        return result.map{
            t -> sellerMapper.map(t)
        }
    }
}