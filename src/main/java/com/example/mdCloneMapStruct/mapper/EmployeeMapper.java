package com.example.mdCloneMapStruct.mapper;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {TimesheetMapper.class})
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(target = "managerDto", source = "manager")
    @Mapping(target = "timesheetDtos", source = "timesheetList")
    EmployeeDto toDTO(Employee employee);

    @Mapping(target = "manager", source = "managerDto")
    @Mapping(target = "timesheetList", source = "timesheetDtos")
    Employee toEntity(EmployeeDto employeeDto);

    default EmployeeDto fromOptional(Optional<Employee> optional) {
        return optional.map(this::toDTO).orElse(null);  // Use the correct method here
    }

    List<EmployeeDto> toDTOList(List<Employee> employees);
    List<Employee> toEntityList(List<EmployeeDto> employeeDtos);

}
