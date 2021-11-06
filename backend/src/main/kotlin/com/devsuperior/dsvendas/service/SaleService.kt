package com.devsuperior.dsvendas.service

import com.devsuperior.dsvendas.dto.SaleDTO
import com.devsuperior.dsvendas.mapper.SaleMapper
import com.devsuperior.dsvendas.repository.SalesRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service


@Service
class SaleService(
    private val repository: SalesRepository,
    private val sellerRepository: SellerService,
    private val saleMapper: SaleMapper
) {

    fun findAll(pageable: Pageable) : Page<SaleDTO> {
        sellerRepository.findAll()
        val result = repository.findAll(pageable)
        return result.map{
            t -> saleMapper.map(t)
        }
    }
}