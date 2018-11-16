/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc2projekt;

/**
 *
 * @author CC2_1D-5
 */
public class OddEven_Table {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] E = {3, 20, 9, 18, 15, 4, 65, 2, 23, 14, };
    
    System.out.println("Elements of Array:\n"+ "3, 9, 15, 20, 65, 23, 18, 4, 2, 14");
    System.out.println("-------------------------------");
    
    System.out.println("Odd\t"+ "Even");
      for (int x=0; x<E.length; x++){
       if( E[x]%2 != 0){
           System.out.print(E[x]+ "\t");
       }
       else {
           System.out.println(E[x]);
       }
      
        
    }
       System.out.println("\n"+ "------------------");
    }
    
}
