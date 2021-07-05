
package projetovolumedocilindro;

import java.util.Locale;
import java.util.Scanner;


 public class cilindro {

    private static Scanner sc;
    
     public static void main(String[] args) {
     
         
         Scanner  sc = new Scanner(System.in);
    
    
   
    
  
    
    System.out.println("`digite o valor da altura em metros:");
           double altura = sc.nextDouble();

    System.out.println("digite o valor do raio em metros:");
           double raio= sc.nextDouble();
           
    System.out.println("o volume do cilindro em metros é "+(raio*raio*3.14*altura));
           
          }
           
     }


