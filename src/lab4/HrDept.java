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
public class HrDept {
    private EmployeeDatabase roster;
    
    public HrDept(){
        this.roster = new EmployeeDatabase();
    }
    
    public void hire(String firstName, String lastName, String ssn){
        Employee e = new Employee(firstName, lastName, ssn);
        roster.addEmployee(e);
        
    }
    
    public void orientEmployee(Employee e, String cubeId){
        e.doFirstTimeOrientation(cubeId);
        
    }
    
    public void getEmployeeStatus(String ssn){
        Employee e = this.roster.findEmployee(ssn);
        boolean emptest = (e.isMetWithHr() && e.isMetDeptStaff() && e.isMovedIn());
        
        if(null == e){
            throw new NullPointerException("Employee cannot be null");
        } else if(!emptest){
          e.getReportService().alert("Employee is not ready for hire");
        } else {
            e.getReportService().outputReport();
        }
    }
}
