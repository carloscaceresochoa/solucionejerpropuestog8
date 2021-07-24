
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
public class tresdigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("Digite n");
        n=teclado.nextInt();
        int d1,d2,d3,temp;
        d3=n%10;
        temp=n/10;
        d2=temp%10;
        d1=temp/10;
        System.out.println("temp "+temp);
        System.out.println("d1 "+d1);
        System.out.println("d2 "+d2);
        System.out.println("d3 "+d3);
        if((d1%2==0) && (d2%2==0) && (d3%2==0)){
            System.out.println("todo los digitos son "
                    + "pares");
        }
        
    }
    
}
