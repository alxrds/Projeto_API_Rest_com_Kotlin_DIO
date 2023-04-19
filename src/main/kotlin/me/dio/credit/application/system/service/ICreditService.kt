package dev.alexandre.credit.application.system.service

import dev.alexandre.credit.application.system.entity.Credit
import java.util.UUID

interface ICreditService {
  fun save(credit: Credit): Credit
  fun findAllByCustomer(customerId: Long): List<Credit>
  fun findByCreditCode(customerId: Long, creditCode: UUID): Credit
}