
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
public class Ejercicio71 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n1,n2;
        System.out.println("Digite n1");
        n1=teclado.nextInt();
        System.out.println("Digite n2");
        n2=teclado.nextInt();
        String salida=(n1>n2)?"n1 es mayor":"n2 es mayor";
       // int ret=(4>3)?1:0;
        //boolean b=(n1>n2)?true:false;
        System.out.println(salida);
        /*
        if(n1>n2){
            System.out.println("n1 es mayor");
        }
        else{
            System.out.println("n2 es mayor");
        }
        */

    }

}
