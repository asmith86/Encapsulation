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
public class HrHire {
    private Employee employee;
    
    public HrHire(Employee emp){
        this.employee = emp;
    }
    
    public void hireNewEmp(String cubeId){
        this.employee.doFirstTimeOrientation(cubeId);
    }

    private Employee getEmployee() {
        return employee;
    }
    
    public void recordEmployee(){
        
    }
    
    
    
    
}
