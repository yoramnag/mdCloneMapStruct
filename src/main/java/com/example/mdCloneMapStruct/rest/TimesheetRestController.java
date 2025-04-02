package com.example.mdCloneMapStruct.rest;

import com.example.mdCloneMapStruct.dto.EmployeeDto;
import com.example.mdCloneMapStruct.dto.TimesheetDto;
import com.example.mdCloneMapStruct.service.TimesheetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/timesheet" , produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class TimesheetRestController {

    private final TimesheetService timesheetService;

    public TimesheetRestController(TimesheetService timesheetService) {
        this.timesheetService = timesheetService;
    }

    @GetMapping("getAllTimesheets")
    public ResponseEntity<List<TimesheetDto>> getAllTimesheets(){
        List<TimesheetDto> timesheetDtos = timesheetService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(timesheetDtos);
    }
}
