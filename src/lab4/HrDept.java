
package lab4;




public class HrDept {
    private  Employee[] emps;
    private int empCount;

    public HrDept(int empNo) {
        this.emps = new Employee[empNo];
        this.empCount = 0;
    }
    
    public void hireEmployee(String firstName, String lastName, String ssn) {
        Employee e = new Employee(firstName,lastName,ssn);
        e.setFirstName(firstName);
        e.setLastName(lastName);
        e.setSsn(ssn);
        this.emps[empCount] = e;
        this.orientEmployee(e, "B204");
        this.empCount += 1;
    }
   
    public void orientEmployee(Employee emp, String cubeId) {
        emp.doFirstTimeOrientation(cubeId);
    }

    public void outputReport(String ssn) {
        Employee e = null;
        
        for(int i = 0; i < emps.length; i++){
            if (this.emps[i].getSsn().equals(ssn)){
                e = this.emps[i];
                break;
            } else {
                return;
            }
        }
        
        

       
        if(e.isMetWithHr() && e.isMetDeptStaff()
           && e.isReviewedDeptPolicies() && e.isMovedIn()) {
            
            e.getReportService().outputReport();
            
        }
    }

    public Employee[] getEmps() {
        return emps;
    }

    
    

    
    

}
