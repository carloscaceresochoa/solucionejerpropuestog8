
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
public class Numero12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int n;
        System.out.println("digite el numero");
        n=teclado.nextInt();
        
        switch(n){
            case 1:
            System.out.println("I");  
            break;
            case 2:
            System.out.println("II");  
            break;
            case 3:
            System.out.println("III");  
            break;
            case 4:
            System.out.println("IV");  
            break;
            case 5:
            System.out.println("V");  
            break;
            case 6:
            System.out.println("VI");  
            break;
            case 7:
            System.out.println("VII");  
            break;
            case 8:
            System.out.println("VIII");  
            break;
            case 9:
            System.out.println("IX");  
            break;
            case 10:
            System.out.println("X");  
            break;
            default:
            System.out.println("valor invalido");
            break;    
           
        }
        
    }
    
}
