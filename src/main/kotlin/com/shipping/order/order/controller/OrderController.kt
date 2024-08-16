package com.shipping.order.order.controller

import com.shipping.order.order.entity.Order
import com.shipping.order.order.service.OrderService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class OrderController(
    private val orderService: OrderService
) {
    @GetMapping("/orders")
    fun getOrders(): List<Order> = orderService.getOrders()
    fun getOrder(): Order = orderService.getOrders()
}