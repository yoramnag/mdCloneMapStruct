package com.example.mdCloneMapStruct.service;

import com.example.mdCloneMapStruct.dto.TimesheetDto;
import com.example.mdCloneMapStruct.entity.Timesheet;
import com.example.mdCloneMapStruct.mapper.TimesheetMapper;
import com.example.mdCloneMapStruct.repository.TimesheetRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TimesheetService {

    private final TimesheetRepository timesheetRepository;
    private final TimesheetMapper timesheetMapper;


    public TimesheetService(TimesheetRepository timesheetRepository, TimesheetMapper timesheetMapper) {
        this.timesheetRepository = timesheetRepository;
        this.timesheetMapper = timesheetMapper;
    }

    public List<TimesheetDto> findAll(){
        List<Timesheet> timesheetList = timesheetRepository.findAll();
        return timesheetMapper.toDTOList(timesheetList);
    }
}
