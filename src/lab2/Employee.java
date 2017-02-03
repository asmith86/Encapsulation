package lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * In this lab focus on METHOD encapsulation and fix/add code as necessary.
 * Pay special attention to the following issues:
 *    1. Not all methods need to be public
 *    2. When methods need to be called in a certain order you can do this
 *       by creating a parent method that calls the other, helper methods.
 *    3. There is some duplicate code used that violates the D.R.Y. principle.
 *       Eliminate that by encapsulating the duplicate code in a new method
 *       and then call that method in place of the duplicate code
 *    4. All method parameters should be validated.
 * 
 * Review the tips in the document "EncapCheckList.pdf" if needed.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String ssn;
    private boolean metWithHr;
    private boolean metDeptStaff;
    private boolean reviewedDeptPolicies;
    private boolean movedIn;
    private String cubeId;
    private Date orientationDate;

    public Employee(String firstName, String lastName, String ssn) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setSsn(ssn);
    }

    
    public void hireEmployee(String cubeId){
        this.meetWithHrForBenefitAndSalryInfo();
        this.meetDepartmentStaff();
        this.reviewDeptPolicies();
        this.moveIntoCubicle(cubeId);
    }
    // Assume this must be performed first, and assume that an employee
    // would only do this once, upon being hired.
    
    
    private void meetWithHrForBenefitAndSalryInfo() {
        metWithHr = true;
        String fmtDate = this.returnFmtDateString(orientationDate);       
        System.out.println(firstName + " " + lastName + " met with Hr on "
            + fmtDate);
    }

    // Assume this must be performed second, and assume that an employee
    // would only do this once, upon being hired.:
    private void meetDepartmentStaff() {
        this.setMetDeptStaff(true);
        String fmtDate = this.returnFmtDateString(orientationDate);       
        System.out.println(firstName + " " + lastName + " met with Dept. Staff on "
            + fmtDate);
    }

    // Assume this must be performed third. And assume that because department
    // policies may change that this method may need to be called 
    // independently from other classes.
    public void reviewDeptPolicies() {
        reviewedDeptPolicies = true; 
        String fmtDate = this.returnFmtDateString(orientationDate);       
        System.out.println(firstName + " " + lastName + " reviewed Dept policies on "
            + fmtDate);
    }

    // Assume this must be performed 4th. And assume that because employees
    // sometimes change office locations that this method may need to be called 
    // independently from other classes.
    public void moveIntoCubicle(String cubeId) {
        if (cubeId == null || cubeId.isEmpty()) {
            throw new IllegalArgumentException();
        } else {
            this.setCubeId(cubeId);
            this.setMovedIn(true);
            String fmtDate = this.returnFmtDateString(orientationDate);
            System.out.println(firstName + " " + lastName + " moved into cubicle "
                    + cubeId + " on " + fmtDate);
        }

    }

    public String getFirstName() {
        return firstName;
    }

    // setter methods give the developer the power to control what data is
    // allowed through validation.
    
    private String validateName(String name){
        if(null == name || name.length() == 0){
            throw new IllegalArgumentException();
        }
        return name;
    }
    public final void setFirstName(String firstName){
       this.validateName(firstName);
       this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public final void setLastName(String lastName) {
        this.validateName(lastName);
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public final void setSsn(String ssn) {
        // validation code here.
        this.ssn = ssn;
    }

    public boolean isMetWithHr() {
        return metWithHr;
    }

  
    private void setMetWithHr(boolean metWithHr) {
        this.metWithHr = metWithHr;
    }

    public boolean isMetDeptStaff() {
        return metDeptStaff;
    }

    public void setMetDeptStaff(boolean metDeptStaff) {
        this.metDeptStaff = metDeptStaff;
    }

    public boolean isReviewedDeptPolicies() {
        return reviewedDeptPolicies;
    }

    private void setReviewedDeptPolicies(boolean reviewedDeptPolicies) {
        this.reviewedDeptPolicies = reviewedDeptPolicies;
    }

    public boolean isMovedIn() {
        return movedIn;
    }

    private void setMovedIn(boolean movedIn) {
        this.movedIn = movedIn;
        if(!movedIn){
            cubeId = "";
        }
    }

    public String getCubeId() {
        return cubeId;
    }

    
    public void setCubeId(String cubeId) {
        // Validation logic
        this.cubeId = cubeId;
    }

    public Date getOrientationDate() {
        return orientationDate;
    }

    public void setOrientationDate(Date orientationDate) {
        // Validation logic.
        this.orientationDate = orientationDate;
    }
    
    private String returnFmtDateString(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
        String fmtDate = sdf.format(date);
        return fmtDate;
    }
}
