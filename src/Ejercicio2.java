
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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         int num;
         System.out.println("digito un numero");
         num=teclado.nextInt();
         if(num>0){
            if(num%2==0){
                System.out.println("el numero es par");
            }
            else{
                 System.out.println("el numero es impar");
            }
         }// solo acepta positivos
         else{
             System.out.println("no acepto numero negativos!!");
         }
         
    }
    
}
