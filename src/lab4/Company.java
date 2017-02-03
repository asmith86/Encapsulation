/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Alex
 */
public class Company {
    private HrDept hr;
    
    public Company(){
        hr = new HrDept(10);
    }
    
    public void hireNewEmp(String firstName, String lastName, String ssn){
        hr.hireEmployee(firstName, lastName, ssn);
        hr.outputReport(ssn);
    }

    public HrDept getHr() {
        return hr;
    }
    
    
}
