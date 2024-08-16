package com.shipping.order.order.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany

@Entity
class ShippingInfo(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long,
    val addressName: String,
    val receiverName: String,
    val receiverPhoneNumber: String,
    val address1: String,
    val address2: String,
    val zipCode: String
)