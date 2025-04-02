package com.example.mdCloneMapStruct.mapper;

import com.example.mdCloneMapStruct.dto.TimesheetDto;
import com.example.mdCloneMapStruct.entity.Timesheet;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TimesheetMapper {
    TimesheetMapper INSTANCE = Mappers.getMapper(TimesheetMapper.class);

    @Mapping(target = "employeeDto", source = "employee") // Map Employee to EmployeeDto
    TimesheetDto toDTO(Timesheet timesheet);

    @Mapping(target = "employee", source = "employeeDto") // Map EmployeeDto to Employee
    Timesheet toEntity(TimesheetDto timesheetDto);

    List<TimesheetDto> toDTOList(List<Timesheet> timesheets);
    List<Timesheet> toEntityList(List<TimesheetDto> timesheetDtos);
}
