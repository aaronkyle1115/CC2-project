/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalfinalactivity;
import java.util.Scanner;
/**
 *
 * @author CC2_1D-5
 */
public class methods {
    public static void display(){
        Scanner s = new Scanner(System.in);
        boolean y = true;
        String d;
        String yorn;
        
        while(y == true){
            System.out.print("What Method do you wish to use? (Fibonacci/Factorial)\n>");
            d = s.next();
            y=false;
        if(d.equalsIgnoreCase("Fibonacci")){
            fupgrade();
            
            
        }
        else if (d.equalsIgnoreCase("Factorial")){
            fact();
            
        }
        else{
            System.out.print("----------Unkown Method----------\nPlease Try Again.\n");
            y = true;
        }
        }
    }
    

    public static int input(){
        Scanner d = new Scanner(System.in);
        System.out.println("Enter size of index:");
        int x = d.nextInt();
        return x;
    }
    
    public static int factorial(int n){
        if (n == 0)    
            return 1;    
        else    
        return(n * factorial(n-1));  
    }
    public static int fib(int n){
        if(n==0)
            return 0;
        else if(n<=2)
            return 1;
        int x = fib(n-1)+ fib(n-2);
        return x;
    }
    static void fact(){
        Scanner d = new Scanner(System.in);
        int h = input();
        int[] arr = new int[h];
        int r;
        System.out.println("Enter elements:\n>");
      for (int x = 0; x < h; x++){
        arr[x] = d.nextInt();
        }
      for (int z = 0; z < arr.length;z++ ){
          System.out.print("F("+ arr[z]+ ")\t");
      }
      System.out.println("\nThe factorail is");
      for (int g = 0; g<arr.length; g++){
          r = factorial(arr[g]);
          System.out.print(r+ "\t");
      }
    }
    
    public static void fupgrade(){
        Scanner d = new Scanner(System.in);
        int h = input();
        int[] arr = new int[h];
        int r;
        System.out.println("Enter elements:\n>");
      for (int x = 0; x < h; x++){
        arr[x] = d.nextInt();
        }
      for (int z = 0; z < arr.length;z++ ){
          System.out.print("F("+ arr[z]+ ")\t");
      }
      System.out.println("\nThe fib is");
      for (int g = 0; g<arr.length; g++){
          r = fib(arr[g]);
          System.out.print(r+ "\t");
      }
      
      
      
     
    }

    
}
