package com.isaax.demo.persistence.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Document("Department")
public class DepartamentosDocuments {


    @Id
    private String id;

    private String nameDep;

}
