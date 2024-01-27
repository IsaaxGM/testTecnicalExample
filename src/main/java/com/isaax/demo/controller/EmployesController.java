package com.isaax.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.isaax.demo.dto.EmployRequest;
import com.isaax.demo.persistence.documents.DepartamentosDocuments;
import com.isaax.demo.service.EmployeService;


@RestController
@RequestMapping("/employ")
public class EmployesController {

    @Autowired
    private EmployeService service;

    @GetMapping("/departamentos")
    @ResponseStatus(HttpStatus.OK)
    public List<DepartamentosDocuments> getDepartamentos() {

        List<DepartamentosDocuments> response = service.getDepartamentos();
        return response;
    }

    @PostMapping("/createEmploy")
    @ResponseStatus(HttpStatus.CREATED)
    public void createEmploy(@RequestBody EmployRequest employRequest) {

        service.createEmploy(employRequest);

    }

}
