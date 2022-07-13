package com.ecomDashboard.service;

import com.ecomDashboard.entity.*;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DashboardService {

    List<CompanyRevenue> getTodayRevenueDash();
    List<EmployeeInformation> getAllEmployeeInfor();
    List<OrderCollectionStatus> getOrderCollection();
    List<OrderReceived> getAllReceived();
    List<ProductCategory> getBestCategory();
    EmployeeInformation addEmployee(EmployeeInformation employeeInformation);
    EmployeeInformation updateEmployee(Long id, EmployeeInformation employeeInformation);
    void deleteEmployee(Long id);

    int totalEmp();
    boolean isEmpExists(Long id);

}
