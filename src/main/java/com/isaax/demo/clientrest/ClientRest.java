package com.isaax.demo.clientrest;


import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import com.isaax.demo.dto.Department;

@FeignClient(name = "departamentos", url = "http://localhost:8094/api/v1")
public interface ClientRest {



    @GetMapping("/departments")
    Department devuelveDepartamentos();

}
