package com.devsuperior.dsvendas.mapper

import com.devsuperior.dsvendas.dto.SellerDTO
import com.devsuperior.dsvendas.entities.Seller
import com.devsuperior.dsvendas.service.SellerService
import org.springframework.stereotype.Component

@Component
class SellerMapper(

): Mapper<Seller, SellerDTO> {
        override fun map(t: Seller): SellerDTO {
            return SellerDTO(
                id = t.id,
                name = t.name
            )
        }
}