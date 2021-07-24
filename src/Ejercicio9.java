
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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double l1,l2,l3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite el lado 1");
        l1=teclado.nextDouble();
        System.out.println("Digite el lado 2");
        l2=teclado.nextDouble();
        System.out.println("Digite el lado 3");
        l3=teclado.nextDouble();
        if(l1==l2 && l1==l3 && l2==l3){
            System.out.println("Triangulo es equilatero");
        }
        else if(l1!=l2 && l1!=l3 && l2!=l3){
            System.out.println("Triangulo es escaleno");
        }
        else{
             System.out.println("Triangulo es Isoceles");
        }
        
        
        
    }
    
}
