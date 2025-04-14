package com.example.mdCloneMapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.entity.Manager;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", uses = {EmployeeMapper.class})
public interface ManagerMapper {

    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);

    @Mapping(target = "employeeDtoList", source = "employeeList")
    ManagerDto toDTO(Manager manager);

    @Mapping(target = "employeeList", source = "employeeDtoList")
    Manager toEntity(ManagerDto managerDto);

    default ManagerDto fromOptional(Optional<Manager> optional) {
        return optional.map(this::toDTO).orElse(null);  // Use the correct method here
    }

    List<ManagerDto> toDTOList(List<Manager> managers);
    List<Manager> toEntityList(List<ManagerDto> managerDtos);


}
