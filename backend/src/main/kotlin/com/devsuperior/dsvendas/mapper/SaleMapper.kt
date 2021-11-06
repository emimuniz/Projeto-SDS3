package com.devsuperior.dsvendas.mapper

import com.devsuperior.dsvendas.dto.SaleDTO
import com.devsuperior.dsvendas.dto.SellerDTO
import com.devsuperior.dsvendas.entities.Sale
import com.devsuperior.dsvendas.entities.Seller
import com.devsuperior.dsvendas.service.SellerService
import org.springframework.stereotype.Component
import java.time.LocalDate

@Component
class SaleMapper(

): Mapper<Sale, SaleDTO> {
        override fun map(t: Sale): SaleDTO {
            return SaleDTO(
                id = t.id,
                visited = t.visited,
                deals = t.deals,
                amount = t.amount,
                date = t.date
            )
        }
}