
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
public class Ejercicio3 {

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
          if(cifras==1){
              System.out.println("una cifra");
          }
          else if(cifras==2){
              System.out.println("dos cifra");
          }
          else if(cifras==3){
              System.out.println("tres cifra");
          }
          else{
              System.out.println("tiene mas de 3 cifras");
          }
          
          
          
      }
      else{
          System.out.println("el numero ingresado es negativo!!");
      }
        
    }
    
}
