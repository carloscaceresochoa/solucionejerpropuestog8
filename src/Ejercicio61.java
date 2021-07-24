
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
public class Ejercicio61 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double compra;
        System.out.println("Digite la compra");
        compra = teclado.nextInt();
        if (compra >= 100000 && compra <= 1000000) {
            compra = compra * 0.9;
        }
        System.out.println("Compra " + compra);
       
    }

}
