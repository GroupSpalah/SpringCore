package org.example.final_project.service;

import lombok.AllArgsConstructor;
import org.example.final_project.dao.CrudDAO;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarServiceImpl implements CrudService {
    CrudDAO dao;

    @Override
    public void save() {
        dao.save();
    }
}
