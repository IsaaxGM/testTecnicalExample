package com.isaax.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.isaax.demo.clientrest.ClientRest;
import com.isaax.demo.dto.DepartamentoDto;
import com.isaax.demo.dto.Department;
import com.isaax.demo.dto.EmployRequest;
import com.isaax.demo.persistence.documents.DepartamentosDocuments;
import com.isaax.demo.persistence.documents.Employ;
import com.isaax.demo.persistence.respositories.DepartamentoRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class EmployeService {

    @Autowired
    private ClientRest clientRest;

    @Autowired
    private DepartamentoRepository repository;

    public List<DepartamentosDocuments> getDepartamentos(){
        log.info("Test");
        Department d = clientRest.devuelveDepartamentos();

        List<DepartamentosDocuments> docs = new ArrayList<>();

        for(String department : d.getDepartamentos()) {
            DepartamentosDocuments dpDoc = new DepartamentosDocuments();
            dpDoc.setNameDep(department);
            docs.add(dpDoc);
        }

        d.getDepartamentos().forEach(b -> {
            DepartamentosDocuments dpDoc = new DepartamentosDocuments();
            dpDoc.setNameDep(b);
            docs.add(dpDoc);
        });

        List<DepartamentosDocuments> saved = repository.saveAll(docs);

        return saved;
    }

    public void createEmploy(EmployRequest employRequest) {

        Optional<DepartamentosDocuments> opt = repository.findById(employRequest.getIdDept());
        String nameDepto = null;
        if (opt.isPresent()) {
            nameDepto = opt.get().getNameDep();
        }

        Employ employ = new Employ();



    }

}
