package com.jamesweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jamesweb.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
