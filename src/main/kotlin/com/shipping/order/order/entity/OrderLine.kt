package com.shipping.order.order.entity

import jakarta.persistence.*

@Entity
class OrderLine(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    @ManyToOne(fetch = FetchType.EAGER)
    val product: Product
)
