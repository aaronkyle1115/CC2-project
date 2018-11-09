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
public class User_Input_2D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner log = new Scanner(System.in);
    System.out.println("How many Elements?");
    int x = log.nextInt();
    int [][] ar = new int[2][x];
    System.out.println("Enter Elements");
    System.out.println("First row");
    
    for(int a = 0; a<ar.length; a++){
      for(int i=0; i<ar[a].length; i++){
          System.out.print("> ");
          ar[a][i] = log.nextInt();
      }
      System.out.println("Second row");
    }
    
    //---------------------------- output
    
      System.out.println("The entered Elements are");
      System.out.println("-----------------------");
      for(int o=0; o<ar.length; o++){
          for(int O = 0; O<ar[o].length; O++){
          System.out.print(ar[O][o]+ " | ");
      }
      System.out.println();
    }
    
    }
    
}
