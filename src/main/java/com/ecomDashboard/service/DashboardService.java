package com.ecomDashboard.service;

import com.ecomDashboard.entity.*;

import java.util.List;

public interface DashboardService {
    List<CompanyRevenue> getTodayRevenueDash();
    List<EmployeeInformation> getAllEmployeeInfor();
    List<OrderCollectionStatus> getOrderCollection();
    List<OrderReceived> getAllReceived();
    List<ProductCategory> getBestCategory();
    void addEmployee(EmployeeInformation employeeInformation);
    EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
    void deleteEmployee(EmployeeInformation employeeInformation);
}
