package com.example.Crud.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Crud.Entity.Employee;
import com.example.Crud.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
    private EmployeeRepository repo;
public List<Employee> listAll() {
        return repo.findAll();
    }
    
    public void save(Employee std) {
        repo.save(std);
    }
    
    public Employee get(int id) {
        return repo.findById(id).get();
    }
    
    public void delete(int id) {
        repo.deleteById(id);
    }

}
