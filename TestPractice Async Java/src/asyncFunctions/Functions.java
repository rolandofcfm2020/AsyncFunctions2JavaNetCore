/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asyncFunctions;

/**
 *
 * @author Rolando
 */
public class Functions {
    
     public String PrintNumberProcess() {
    
        try {
       
        System.out.println("Function printNumberProcess is working in some thread ");
        
            for (int i = 0; i < 1000; i++) {
                  System.out.println(i);
            }
        }
        catch(Exception ex)
        {
        
        }
        //System.out.println("Java sucks!");
        return "I already print all numbers";
    }
}
