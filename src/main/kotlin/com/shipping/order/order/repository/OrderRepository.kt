package com.shipping.order.order.repository

import com.shipping.order.member.entity.Member
import com.shipping.order.order.entity.Order
import org.springframework.data.jpa.repository.JpaRepository

interface OrderRepository: JpaRepository<Order, Long> {
    fun findByOrderMember(orderMember: Member): List<Order>
}