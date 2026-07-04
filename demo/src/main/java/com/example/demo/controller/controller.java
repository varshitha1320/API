package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Employee;
import com.example.demo.services.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/employee")
public class controller 
{
 @Autowired
 service serve;
 @GetMapping
 public List<Employee> getEmployees()
 {
    return serve.getEmployees();
 }
 @GetMapping("/{id}")
 public Employee getEmployee(@PathVariable Long id)
 {
    return serve.getEmployee(id);
 }
 @PostMapping
 public Employee saveEmployee(@RequestBody Employee emp)
 {
    return serve.saveEmployee(emp);
 }
 @PutMapping("/{id}")
 public Employee updatEmployee(@PathVariable Long id,@RequestBody Employee emp) 
 {
    return serve.updateEmployee(id, emp);
 }
 @DeleteMapping("/{id}")
 public String deleteEmployee (@PathVariable Long id)
 {
    serve.deleteEmployee(id);
    return "Employ Deleted Successfully";
 }    
}