package com.ecomDashboard.service.impl;

import com.ecomDashboard.entity.*;
import com.ecomDashboard.repositories.*;
import com.ecomDashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.Long;

@Service
@Qualifier(value = "DashboardServiceImpl")
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
    public EmployeeInformation addEmployee(EmployeeInformation employeeInformation) {
        return employeeInformationRepository.save(employeeInformation);
    }

    @Override
    public EmployeeInformation updateEmployee(Long id, EmployeeInformation employeeInformation) {
        EmployeeInformation emp = employeeInformationRepository.findById(id).get();
        emp.setAge(employeeInformation.getAge());
        emp.setName(employeeInformation.getName());
        emp.setDate(employeeInformation.getDate());
        emp.setOfficeLocation(employeeInformation.getOfficeLocation());
        emp.setPosition(employeeInformation.getPosition());
        emp.setSalary(employeeInformation.getSalary());
        employeeInformationRepository.save(emp);
        return emp;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeInformationRepository.delete(employeeInformationRepository.findById(id).get());
    }

    @Override
    public int totalEmp() {
        return (int) employeeInformationRepository.count();
    }

    @Override
    public boolean isEmpExists (Long id) {
        return employeeInformationRepository.existsById(id);
    }
}
