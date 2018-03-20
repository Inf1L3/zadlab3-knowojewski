/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

import java.util.Scanner;


/**
 *
 * @author XsaRdaS 1.4 1.7 2.2 3.3 3.4
 */
public class Zadania {
    public static void main(String[] args) {
         //Scanner input = new Scanner(System.in);
 /*   ZADANIE 1.4:    
    int a, b, c;
    a = 24 << 10; 
    b = 13 >> 3;
    c = 34 >>> 4;
    System.out.println("Działanie 24 << 10 daje wynik: " +a );
    System.out.println("Działanie 13 >> 3 daje wynik: "+b);
    System.out.println("Działanie 34 >>> 4 daje wynik: "c); 

    ZADANIE 1.7 
    
    System.out.println("Operator NOT jest to zaprzeczenie.");
    System.out.println("Podaj a i b");
    Scanner input = new Scanner(System.in);
    int a;
    int b;
   
    a =input.nextInt();
    b =input.nextInt();
    
    if (a>b){
        System.out.println("b jest wieksze od b");
    } else if (!(a>b)) {
        System.out.println("b jest wieksze od a");
    } else {
        System.out.println("a i be sa rowne");
    }
     
    System.out.println("Operator XOR jest to alternatywa rozlaczna");
    int x;
    int y;
    int z;
    x = input.nextInt();
    y = input.nextInt();
    if(!(x>3 || y>3) ){
       System.out.println("Ani x ani y nie jest wieksze od 3 lub jedna z nich jest wieksza od 3"); 
    }else {
        System.out.println("Obie sa wieksze od 3");
    }
        ZADANIE 2.2 
    String tekst = "Lubie placki";
    char[] tab = tekst.toCharArray();
    for(int i=0;i<tab.length;i++)
    {
        System.out.println(i+" znak to: "+tab[i] );
    }
    
    byte[] byt= tekst.getBytes();
    for(int i=0;i<byt.length;i++)
    {
        System.out.println("Znak: "+tab[i]+", waży:" +byt[i]);
    }
    String tekst2="hop siup";
    boolean a;
    a=tekst2.equals(tekst2);
    System.out.println(a);
  
    a=tekst2.equalsIgnoreCase(tekst2);
    System.out.println(a);
    
    int x;
    x=tekst.compareTo(tekst2);
    System.out.println(a);
    
    x=tekst.compareToIgnoreCase(tekst2);
    System.out.println(a);
    
    x=tekst.indexOf("L");
    System.out.println(x);
    
    x=tekst.indexOf("i",4);
    System.out.println(x);
    
    x=tekst.lastIndexOf("p");
    System.out.println(x);
    
    x=tekst.lastIndexOf("p",1);
    System.out.println(x);
    
    String tekst3;
    tekst3=tekst.substring(2);
    System.out.println(tekst3);
     
    tekst3=tekst.substring(1,3);
    System.out.println(tekst3);
     
    String tekst4="Kozak";
    tekst3=tekst4.replace("K","R");
    System.out.println(tekst3);
    
    String tekst5="               Kozak rośnie w lesie            ";
    System.out.println(tekst5);
    System.out.println(tekst5.trim());
    
    System.out.println(tekst5.toLowerCase());
    
    System.out.println(tekst5.toUpperCase());
ZADANIE 3.3
         REKURENCJA: */

    /*int x, b;
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj liczbe i liczbe potegi:");
    x = input.nextInt();
    b = input.nextInt();
    System.out.println(x+"podniesione do " +b+" wynosi: "+potega(x, b));
        

*/


   /* }  
    public static int potega(int a, int b) {
    if(b==0)return 1;
    else return a*potega(a,b-1);
    }
    int z, v;
    int h=1;
    int i;
    System.out.println("Podaj liczbe i potege liczby:");
    Scanner input = new Scanner(System.in);
    z = input.nextInt();
    v = input.nextInt();
    for(i=1;i<=v;i++){
        h=h*z;
        
    }
    System.out.println("Wynik potegowania to: "+h);
    */
   
   //ZADANIE 3.4
   Scanner input = new Scanner(System.in);
   int[] tab = new int[1000000];
   int n;
   
   System.out.println("Ile wyrazow ciagu Fibonacciego mam wyznaczyc?");
   n= input.nextInt();
   tab[0]=0;
   tab[1]=1;
          
   for(int i=2; i<n; i++){
      tab[i]=tab[i-1]+tab[i-2];
      System.out.println("Wyraz nr "+ (i-1) +" wynosi "+tab[i]);
   }
   
   }
}    
   
