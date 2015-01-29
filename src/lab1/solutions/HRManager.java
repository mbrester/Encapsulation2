/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1.solutions;


/**
 *
 * @author mbrester1
 */
public class HRManager {
    private Employee newHire;

    public HRManager() {
    }
    
    public void hireEmployee(String fName, String lName, String ssn, String cubeId){
     
    newHire = new Employee(fName, lName, ssn);
    newHire.goThroughHigheringProcess(cubeId);
    
    
    }

   
    

}

    

