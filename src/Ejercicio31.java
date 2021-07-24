
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
public class Ejercicio31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
               
      int n;
      String ns;
      int cifras;
     
      System.out.println("digite el numero");
      n=teclado.nextInt();
      if(n>=0){
         // 45-2
          ns=String.valueOf(n);    
          cifras=ns.length();
          switch(cifras){ 
              case 1:
              System.out.println("una cifra");
              break;
              case 2:
              System.out.println("dos cifra");
              break;
              case 3:
              System.out.println("tres cifra");
              break;
              default:
              System.out.println("tiene mas de 3 cifras");
              break;
          
      }
          
          
      }
      else{
          System.out.println("el numero ingresado es negativo!!");
      }
        
    }
    
}
