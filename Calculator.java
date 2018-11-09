/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2projekt;
import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        String a;
        int num1;
        int num2;
        int num3;
        
        System.out.println("Choose operation:+ - * / %");
        a = Calc.next();
        
        System.out.println("-------------------------");
        switch(a){
            
         case "addition":   
         case "+":
          System.out.println("Insert First Number");
          num1 = Calc.nextInt();
          System.out.println("Insert Second Number");
          num2 = Calc.nextInt();
          num3 = num1 + num2;
          System.out.println("-------------------------");
          System.out.println("Your answer is "+ num3);
           break;
         
         case "subtraction":  
         case "-":   
          System.out.println("Insert First Number");
          num1 = Calc.nextInt();
          System.out.println("Insert Second Number");
          num2 = Calc.nextInt();
          num3 = num1 - num2;
          System.out.println("-------------------------");
          System.out.println("Your answer is "+ num3);
           break;
         
         case "multiplication":  
         case "*":   
          System.out.println("Insert First Number");
          num1 = Calc.nextInt();
          System.out.println("Insert Second Number");
          num2 = Calc.nextInt();
          num3 = num1 * num2;
          System.out.println("-------------------------");
          System.out.println("Your answer is "+ num3);
           break;
         
         case " divition":  
         case "/":   
          System.out.println("Insert First Number");
          num1 = Calc.nextInt();
          System.out.println("Insert Second Number");
          num2 = Calc.nextInt();
          num3 = num1 / num2;
          System.out.println("-------------------------");
          System.out.println("Your answer is "+ num3);
           break; 
         
         case "modulation":  
         case "%":   
          System.out.println("Insert First Number");
          num1 = Calc.nextInt();
          System.out.println("Insert Second Number");
          num2 = Calc.nextInt();
          num3 = num1 % num2;
          System.out.println("-------------------------");
          System.out.println("Your answer is "+ num3);
           break;  
         
         default:
             System.out.println("This ("+ a + ") Doesnt exist in our database.");
    }  
    }
    
}
