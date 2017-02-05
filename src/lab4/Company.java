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
        hr = new HrDept();
    }
    
    public void hireNewEmp(String firstName, String lastName, String ssn, String cubeId){
        hr.hire(firstName, lastName, ssn, cubeId);
        hr.getEmployeeStatus(ssn);
    }

    public HrDept getHr() {
        return hr;
    }
    
    
}
