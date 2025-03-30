package com.example.mdCloneMapStruct.service;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.entity.Employee;
import com.example.mdCloneMapStruct.mapper.EmployeeMapper;
import com.example.mdCloneMapStruct.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public EmployeeService(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    public List<EmployeeDto> findAll(){
        List<Employee> employeeList = employeeRepository.findAll();
        return employeeMapper.toDTOList(employeeList);
    }
}
