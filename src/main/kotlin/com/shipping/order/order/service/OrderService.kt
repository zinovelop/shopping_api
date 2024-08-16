package com.shipping.order.order.service

import com.shipping.order.member.entity.Member
import com.shipping.order.order.entity.Order
import com.shipping.order.order.repository.OrderRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import kotlin.jvm.optionals.getOrNull

@Service
class OrderService (
    private val orderRepository: OrderRepository
){
    /* 주문조회 */
    // 전체 주문 조회
    fun getOrders(): List<Order> = orderRepository.findAll()
    // 특정 주문건 조회
    fun getOrderById(id: Long): Order = orderRepository.findById(id).getOrNull() ?: throw Exception("This Order is not exist!!")
    // 멤버의 주문 조회
    fun getOrderByMember(member: Member):List<Order> = orderRepository.findByOrderMember(member)

}