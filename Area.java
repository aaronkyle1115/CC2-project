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
public class Area {

    public static void main(String[] args) {
       Scanner log = new Scanner(System.in);
        double a;
        double a1;
        double a2;
        double a3;
        double a4;
        double a5;
        System.out.println();
        
        System.out.println("Enter Radius of Circle:");
        a = log.nextInt();
        System.out.println("The radius of the circle is "+ Math.PI * (Math.pow(a, 2)));
        System.out.println();
        System.out.println("Enter side of Square:");
        a1 = log.nextInt();
        a2 =  Math.pow(a1, 2);
        System.out.println("The area of the square is "+ a2);
        System.out.println();
        System.out.println("Enter Height of triangle:");
        a3 = log.nextInt();
        System.out.println("Enter Base of Triangle:");
        a4 = log.nextInt();
        a5 =  a3 * a4 / 2;
        System.out.println("The area of the Triangle is "+ a5);
        
    }
    
}
