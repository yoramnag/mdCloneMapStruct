package com.example.mdCloneMapStruct.mapper;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "managerDto", source = "manager")
    EmployeeDto toDTO(Employee employee);

    @Mapping(target = "manager", source = "managerDto")
    Employee toEntity(EmployeeDto employeeDto);

    List<EmployeeDto> toDTOList(List<Employee> employees);
    List<Employee> toEntityList(List<EmployeeDto> employeeDtos);

}
