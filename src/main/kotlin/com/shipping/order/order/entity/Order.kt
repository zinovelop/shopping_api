package com.shipping.order.order.entity

import com.shipping.order.member.entity.Member
import jakarta.persistence.*
import java.time.LocalDateTime

enum class OrderState {
    PAYMENT_WAITING,
    PREPARING,
    SHIPPED,
    DELIVERING,
    DELIVERY_COMPLETED
}

@Entity
@Table(name = "orders")
class Order(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    @OneToMany
    val orderLine: List<OrderLine>,
    val orderDateTime: LocalDateTime,
    @ManyToOne
    val orderMember: Member,
    val state: OrderState,
    @ManyToOne
    val shippingInfo: ShippingInfo
    )