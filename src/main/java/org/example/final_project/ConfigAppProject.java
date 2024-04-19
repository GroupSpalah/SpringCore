package org.example.final_project;

import org.example.final_project.dao.CarDAOImpl;
import org.example.final_project.dao.CrudDAO;
import org.example.final_project.service.CarServiceImpl;
import org.example.final_project.service.CrudService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "org.example.final_project.dao",
        "org.example.final_project.service"})
public class ConfigAppProject {
/*    @Bean
    public CrudDAO crudDAO() {
        return new CarDAOImpl();
    }

    @Bean
    public CrudService crudService(CrudDAO crudDAO) {
        return new CarServiceImpl(crudDAO);
    }*/
}
