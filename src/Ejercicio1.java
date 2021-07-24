
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carca
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      Scanner teclado=new Scanner(System.in);
      int edad;
      System.out.println("digite la edad");
      edad=teclado.nextInt();
      if(edad>=18){
          System.out.println("mayor de edad");
      }  
      else if(edad>=4 && edad<=100){
          System.out.println("es menor de edad");
      }
       
    }
    
}
