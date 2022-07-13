package com.ecomDashboard.controller;

import com.ecomDashboard.entity.EmployeeInformation;
import com.ecomDashboard.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("api/ecommerce")
public class endpointRESTAPI {

    @Autowired
    private DashboardService dashboardService;

    @RequestMapping(value = "/employees", method = RequestMethod.GET)
    public List<EmployeeInformation> getAllEmployees() {
        return dashboardService.getAllEmployeeInfor();
    }

    @RequestMapping(value = "/updateemployee/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> updateEmp(@PathVariable("id") Long id,
                                       @RequestBody EmployeeInformation employeeInformation) {

        if(!dashboardService.isEmpExists(id)) {
            return new ResponseEntity<>(Map.of("error","Employee with input id not found"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(dashboardService.updateEmployee(id, employeeInformation), HttpStatus.OK);
    }

    @RequestMapping(value = "/newemployee", method = RequestMethod.POST)
    public EmployeeInformation addEmp(@RequestBody EmployeeInformation employeeInformation) {
        return dashboardService.addEmployee(employeeInformation);
    }


    @RequestMapping(value = "/firedemployee/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleEmp(@PathVariable("id") Long id) {
        if(!dashboardService.isEmpExists(id)) {
            return new ResponseEntity<>(Map.of("error","Employee with input id not found"), HttpStatus.BAD_REQUEST);
        }
        dashboardService.deleteEmployee(id);
        return new ResponseEntity<>(Map.of("success", "This employee is deleted, please check again"), HttpStatus.OK);
    }
}
