package com.example.payroll.configurations;

import com.example.payroll.entities.Employee;
import com.example.payroll.repository.EmployeeRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(Logger.class);
    
    @Bean
    public CommandLineRunner initDatabase(EmployeeRepository employeeRepository) {
        return args -> {
            log.info("Preloading " + employeeRepository.save(new Employee("Pradeep Kumar", "SDE")));
            log.info("Preloading " + employeeRepository.save(new Employee("Priyanka Singh", "Tester")));
        };
    }
}
