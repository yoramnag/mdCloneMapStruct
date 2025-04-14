package com.example.mdCloneMapStruct.service;

import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.entity.Manager;
import com.example.mdCloneMapStruct.mapper.ManagerMapper;
import com.example.mdCloneMapStruct.repository.ManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    private final ManagerRepository managerRepository;
    private final ManagerMapper managerMapper;

    public ManagerService(ManagerRepository managerRepository, ManagerMapper managerMapper) {
        this.managerRepository = managerRepository;
        this.managerMapper = managerMapper;
    }

    public List<ManagerDto> findAll(){
        List<Manager> managerList = managerRepository.findAll();
        return managerMapper.toDTOList(managerList);
    }

    public ManagerDto findByName(String firstName, String lastName) {

        return null;
    }
}
