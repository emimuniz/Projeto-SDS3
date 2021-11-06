package com.devsuperior.dsvendas.service

import com.devsuperior.dsvendas.dto.SaleDTO
import com.devsuperior.dsvendas.dto.SaleSuccessDTO
import com.devsuperior.dsvendas.dto.SaleSumDTO
import com.devsuperior.dsvendas.mapper.SaleMapper
import com.devsuperior.dsvendas.repository.SaleRepository
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import javax.transaction.Transactional


@Service
class SaleService(
    private val repository: SaleRepository,
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

    fun amountGroupedBySeller(): List<SaleSumDTO>{
        return repository.amountGroupedBySeller()
    }

    fun sucessGroupedBySeller(): List<SaleSuccessDTO>{
        return repository.sucessGroupedBySeller()
    }
}