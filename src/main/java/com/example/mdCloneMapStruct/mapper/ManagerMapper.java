package com.example.mdCloneMapStruct.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.entity.Manager;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ManagerMapper {

    ManagerMapper INSTANCE = Mappers.getMapper(ManagerMapper.class);

    Manager toEntity(ManagerDto managerDto);
    ManagerDto toDTO(Manager manager);
    List<ManagerDto> toDTOList(List<Manager> managers);


}
