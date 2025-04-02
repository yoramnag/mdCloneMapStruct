package com.example.mdCloneMapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.entity.Manager;

import java.util.List;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface ManagerMapper {

    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);

    @Mapping(target = "employeeDtoList", source = "employeeList")
    ManagerDto toDTO(Manager manager);

    @Mapping(target = "employeeList", source = "employeeDtoList")
    Manager toEntity(ManagerDto managerDto);

    List<ManagerDto> toDTOList(List<Manager> managers);
    List<Manager> toEntityList(List<ManagerDto> managerDtos);


}
