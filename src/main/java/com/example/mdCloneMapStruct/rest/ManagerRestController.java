package com.example.mdCloneMapStruct.rest;

import com.example.mdCloneMapStruct.dto.ManagerDto;
import com.example.mdCloneMapStruct.service.ManagerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/manager" , produces = MediaType.APPLICATION_JSON_VALUE)
@Validated
public class ManagerRestController {

    private final ManagerService managerService;

    public ManagerRestController(ManagerService managerService) {
        this.managerService = managerService;
    }

    @GetMapping("/getAllManagers")
    public ResponseEntity<List<ManagerDto>> getAllManagers(){
        List<ManagerDto> managerDtoList = managerService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(managerDtoList);
    }

    @GetMapping("/getManagerByName")
    public ResponseEntity<ManagerDto> getManagerByName(@RequestParam String firstName, @RequestParam String lastName){
        ManagerDto managerDto = managerService.findByName(firstName,lastName);
        return ResponseEntity.status(HttpStatus.OK).body(managerDto);
    }
}
