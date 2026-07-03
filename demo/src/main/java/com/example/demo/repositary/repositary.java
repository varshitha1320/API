package com.example.demo.repositary;

import com.example.demo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface repositary  extends JpaRepository<Employee,Long>
{
    
}
