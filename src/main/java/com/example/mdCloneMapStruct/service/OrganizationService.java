package com.example.mdCloneMapStruct.service;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.entity.Employee;
import com.example.mdCloneMapStruct.entity.Manager;
import com.example.mdCloneMapStruct.exception.EmployeeNotFoundException;
import com.example.mdCloneMapStruct.exception.ManagerNotFoundException;
import com.example.mdCloneMapStruct.mapper.EmployeeMapper;
import com.example.mdCloneMapStruct.mapper.ManagerMapper;
import com.example.mdCloneMapStruct.repository.EmployeeRepository;
import org.springframework.stereotype.Service;
import com.example.mdCloneMapStruct.repository.ManagerRepository;

import java.util.Optional;

@Service
public class OrganizationService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;
    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;


    public OrganizationService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper, ManagerRepository managerRepository, ManagerMapper managerMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
        this.managerRepository = managerRepository;
        this.managerMapper = managerMapper;
    }

    public Manager retrieveManager(String firstName, String lastName){
        Optional<Manager> optionalManager = managerRepository.findByFirstNameAndLastName(firstName,lastName);
        if(!optionalManager.isPresent()){
            throw new ManagerNotFoundException("manager","manger name",firstName+" "+lastName);
        }
        ManagerDto managerDto = managerMapper.fromOptional(optionalManager);
        Manager manager = managerMapper.toEntity(managerDto);
        return manager;
    }

    public Employee retrieveEmployee(String firstName, String lastName){
        Optional<Employee> optionalEmployee = employeeRepository.findByFirstNameAndLastName(firstName,lastName);
        if (!optionalEmployee.isPresent()){
            throw new EmployeeNotFoundException("employee","employee name",firstName+" "+lastName);
        }
        EmployeeDto employeeDto = employeeMapper.fromOptional(optionalEmployee);
        Employee employee = employeeMapper.toEntity(employeeDto);
        return employee;
    }


}
