package com.sda.service;

import com.sda.dto.EmployeeDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    public List<EmployeeDTO> displayEmployeeDTO() {
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        EmployeeDTO employeeDTO1 = new EmployeeDTO();
        employeeDTO1.setName("marius");
        employeeDTO1.setAge(25);
        employeeDTO1.setPosition("worker");

        EmployeeDTO employeeDTO2 = new EmployeeDTO();
        employeeDTO2.setName("vlad");
        employeeDTO2.setAge(45);
        employeeDTO2.setPosition("manager");

        EmployeeDTO employeeDTO3 = new EmployeeDTO();
        employeeDTO3.setName("Igor");
        employeeDTO3.setAge(32);
        employeeDTO3.setPosition("spammer");

        employeeDTOList.add(employeeDTO1);
        employeeDTOList.add(employeeDTO2);
        employeeDTOList.add(employeeDTO3);

        return employeeDTOList;

    }

}
