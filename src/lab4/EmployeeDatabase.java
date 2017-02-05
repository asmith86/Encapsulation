/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alex
 */
public class EmployeeDatabase {
    private final List<Employee> employees;
    
    public EmployeeDatabase(){
        this.employees = new ArrayList();
    }
    
    public Employee findEmployee(String ssn){
        Employee emp = null;
        for(Employee e : this.employees){
            if(e.getSsn().equals(ssn)){
                emp = e;
            } 
        }
        return emp;
    }
    
    public void addEmployee(Employee e){
        this.employees.add(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
    
    
    
}
