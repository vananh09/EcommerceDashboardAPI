package com.ecomDashboard.repositories;

import com.ecomDashboard.entity.OrderReceived;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "OrderReceivedRepository")
public interface OrderReceivedRepository extends JpaRepository<OrderReceived, Long> {
}
