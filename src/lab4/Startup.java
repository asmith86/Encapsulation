package lab4;

/**
 * This class is the startup class for the program. But together with the 
 * other classes provided it is not a particularly good simulation of the 
 * real world. Employees don't just hire themselves and them tell themselves
 * to go through orientation. There's usually a company and a HR person involved.
 *
 * @author      Jim Lombardo, WCTC Instructor
 * @version     1.02
 */
public class Startup {
    public static void main(String[] args) {

        Company c = new Company();
        
        c.hireNewEmp("John", "Doe", "888-88-8888", "E015");
        
        c.hireNewEmp("Who", "Ever", "222-22-2222", "A101");
       
      
        
        
    }
    
    
}
