package com.ecomDashboard.repositories;

import com.ecomDashboard.entity.CompanyRevenue;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier(value = "CompanyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenue, Long> {
}
