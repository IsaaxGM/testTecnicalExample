package com.isaax.demo.persistence.documents;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document("Employ")
public class Employ {
    @Id
    private String id;

    private String idDep;

    private String name;

    private String lastName;

}
