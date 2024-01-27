package com.isaax.demo.dto;

import java.util.HashSet;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Department {

    public Department() {

    }

    public Department(HashSet<String> departamentos){
        this.departamentos=departamentos;
    }
    HashSet<String> departamentos;
}
