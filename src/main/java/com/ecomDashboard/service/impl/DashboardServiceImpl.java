package com.ecomDashboard.service.impl;

import com.ecomDashboard.entity.*;
import com.ecomDashboard.repositories.*;
import com.ecomDashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DashboardServiceImpl implements DashboardService {

    @Autowired
    CompanyRevenueRepository companyRevenueRepository;
    @Autowired
    EmployeeInformationRepository employeeInformationRepository;
    @Autowired
    OrderCollectionStatusRepository orderCollectionStatusRepository;
    @Autowired
    OrderReceivedRepository orderReceivedRepository;
    @Autowired
    ProductCategoryRepository productCategoryRepository;

    @Override
    public List<CompanyRevenue> getTodayRevenueDash() {
        return companyRevenueRepository.findAll();
    }

    @Override
    public List<EmployeeInformation> getAllEmployeeInfor() {
        return employeeInformationRepository.findAll();
    }

    @Override
    public List<OrderCollectionStatus> getOrderCollection() {
        return orderCollectionStatusRepository.findAll();
    }

    @Override
    public List<OrderReceived> getAllReceived() {
        return orderReceivedRepository.findAll();
    }

    @Override
    public List<ProductCategory> getBestCategory() {
        return productCategoryRepository.findByBestCategory(true);
    }

    @Override
    public void addEmployee(EmployeeInformation employeeInformation) {
        employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public void deleteEmployee(EmployeeInformation employeeInformation) {
        employeeInformationRepository.delete(employeeInformation);
    }


}
