/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.edu.ur.POLab3;

import java.util.Scanner;

/**
 *
 * @author Asia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        // ZADANIE 1.3:
    /*    int a = 6; // 110
        int b = 4; // 100

        // Bitwise AND    

        int c = a & b;
        //   110
        // & 100
        // -----
        //   100

        // Bitwise OR

        int d = a | b;
        //   110
        // | 100
        // -----
        //   110

        System.out.println(c); // 4
        System.out.println(d); // 6
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        if (a>0||b>0){
            System.out.println("Conajmniej jedna liczba jest dodatnia.");            
        }else {
            System.out.println("Zadna liczba nie jest dodatnia.");
        }
        if (a>0&&b>0){
            System.out.println("Obie liczby sa dodatnie.");
        }else {
            System.out.println("Przynajmniej jedna liczba nie jest dodatnia.");
        }
        
      int a = 5;
      int b = 3;
      int d = (a++)+b;
      System.out.println(d);
    
    String s1 = new String( "Happy " );
      String s2 = new String( "Birthday" );

      System.out.printf( "s1 = %s\ns2 = %s\n\n",s1, s2 );
      System.out.printf( 
         "Result of s1.concat( s2 ) = %s\n", s1.concat( s2 ) );
      System.out.printf( "s1 after concatenation = %s\n", s1 );  
    */
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj liczbe aby obilczyc jej silnie.");
    int a= input.nextInt();
    int iloczyn = 1;
    int i;
    for(i=1;i==a;i++){
       iloczyn *= i; 
    }
    System.out.println(iloczyn);
        }
    
}

