/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2projekt;

import java.util.Scanner;

/**
 *
 * @author CC2_1D-5
 */
public class Fibbonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Fdisplay();
       
    }
    public static int fib(int n){
        if(n==0)
            return 0;
        else if(n<=2)
            return 1;
        int x = fib(n-1)+ fib(n-2);
        return x;
    }
    public static int finput(){
        System.out.println("Enter limit:");
        Scanner log = new Scanner(System.in);
        int x = log.nextInt();
        return x;
    }
    public static void Fdisplay(){
        int x = finput();
         System.out.println("---------------------------------");
        for(int a = 0; a<= x; a++){
       System.out.print("F("+ a+ ")\t");}
       
        for(int j = 0; j<=x; j++){
             System.out.println();
        for(int i =0; i<+j; i++){
             int y = fib(i);
            System.out.print(y+ "\t");
        }
       
    }
    
}
}
