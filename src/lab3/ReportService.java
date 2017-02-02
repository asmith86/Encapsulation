/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alex
 */
public class ReportService {
    
    public void generateEmployeeReport(String firstName, String lastName, 
            String msg, String fmtDate){
        
        String output = firstName + " " + lastName + " " + msg + " " + fmtDate;
        
        System.out.println(output);
        
    }
}
