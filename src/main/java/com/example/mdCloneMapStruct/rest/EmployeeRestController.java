package com.example.mdCloneMapStruct.rest;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/employee" , produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class EmployeeRestController {

    private final EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("getAllEmployees")
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employeeDtoList = employeeService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(employeeDtoList);
    }
}
