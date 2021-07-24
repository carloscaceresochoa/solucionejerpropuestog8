
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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int compra;
        double descuento;
        double total;
        descuento = 0;
        System.out.println("Digite la compra");
        compra = teclado.nextInt();
        if (compra >= 100000 && compra <= 1000000) {
            descuento = compra * 0.1;
        }
        total = compra - descuento;
        System.out.println("Compra " + compra);
        System.out.println("Descuento " + descuento);
        System.out.println("total " + total);

    }

}
