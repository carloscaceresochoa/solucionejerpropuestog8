
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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        double notaf;
        System.out.println("Digite la nota final");
        notaf=teclado.nextDouble();
        if(notaf>=0 && notaf<2.96){
            System.out.println("Perdio Algoritmos");
        }
        else if(notaf>=2.96){
            System.out.println("Gano Algoritmos");
        }
    }
    
}
