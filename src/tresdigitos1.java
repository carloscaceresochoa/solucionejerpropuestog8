
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
public class tresdigitos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n;
        int d1,d2,d3,temp;
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite n");
        n=teclado.nextLine();
        if(n.length()==3){
        d1=Integer.valueOf(String.valueOf(n.charAt(0)));
        d2=Integer.valueOf(String.valueOf(n.charAt(1)));
        d3=Integer.valueOf(String.valueOf(n.charAt(2)));
         
        
       
        System.out.println("d1 "+d1);
        System.out.println("d2 "+d2);
        System.out.println("d3 "+d3);
        if((d1%2==0) && (d2%2==0) && (d3%2==0)){
            System.out.println("todo los digitos son "
                    + "pares");
        }
    
        }//
        else{
            System.out.println("No es posible hacer la "
                    + "operacion");
        }
        
    }
        
    
    
}
