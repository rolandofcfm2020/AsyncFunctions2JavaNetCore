
package testpractice;

import asyncFunctions.*;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rolando
 */
public class TestPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        Functions func =  new Functions();
       // boolean finalworkFinished = false;
         MyBooleanObject boolObj = new MyBooleanObject();
         boolObj.setBooleanValue(false);
        
        
            CompletableFuture.runAsync(()-> {
                
                String stringTask = func.PrintNumberProcess();
                System.out.println("Procesamiento asincrono terminado");
                
            }).thenRun(() -> 
            { 
              boolObj.setBooleanValue(true);
              System.out.println("Ahora si, por fin terminé! en el proceso principal");
              
            });
        
        System.out.println("Corriendo proceso principal!");
        
        while (!boolObj.getBooleanValue())
        {
        System.out.println("Todavia no acabo!! estate!");
        
        }
        
        //Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        //String userName = myObj.nextLine();
        
        
  
        
    }
    
}
