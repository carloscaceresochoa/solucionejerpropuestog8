
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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("digite n");
        n=teclado.nextInt();
        boolean salb=(n%2==0)?true:false;
        String texto="El Numero "+n+" es ";
        String salida=(n%2==0)?texto+"par":texto+"impar";
        //System.out.println(salb);
        System.out.println(salida);
        
    }
    
}
