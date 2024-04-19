package org.example.final_project.dao;

import org.springframework.stereotype.Repository;

@Repository
public class CarDAOImpl implements CrudDAO {
    @Override
    public void save() {
        System.out.println("Save");
    }
}
