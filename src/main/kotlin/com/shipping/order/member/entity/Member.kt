package com.shipping.order.member.entity

import com.shipping.order.order.entity.Order
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "members")
class Member(
    @Id
    val id: String,
    val name: String,
    @OneToMany
    val orders: List<Order>
)