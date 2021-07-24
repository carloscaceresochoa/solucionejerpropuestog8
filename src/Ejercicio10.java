
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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        // ejercicio 9
         String nombre1;
        String nombre2;
        System.out.println("digite el nombre");
        nombre1=teclado.nextLine();
        System.out.println("digite el nombre 2");
        nombre2=teclado.nextLine();
        if(nombre1.equals(nombre2)){
            System.out.println("cadenas iguales");
        }
        else if(nombre1.equalsIgnoreCase(nombre2)){
            System.out.println("cadenas iguales");
        }
        else{
            System.out.println("cadenas No son iguales");
        }
        
        
        
    }
    
}
