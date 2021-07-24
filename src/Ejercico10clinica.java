
import java.text.DecimalFormat;
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
public class Ejercico10clinica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner teclado = new Scanner(System.in);
          int totalpresup;
          double prepgin;
          double preptraum;
          double presped;
          DecimalFormat formateador = new DecimalFormat("0000.00");
          
          System.out.println("Digite el presupuesto total");
          totalpresup=teclado.nextInt();
          prepgin=totalpresup*0.3975;
          preptraum=totalpresup*0.3165;
          presped=totalpresup*0.286;
          double gastgin;
          double gasttraum;
          double gastped;
          System.out.println("presupuesto ginecologia "+formateador.format (prepgin));
          System.out.println("presupuesto traumatologia "+formateador.format (preptraum));
          System.out.println("presupuesto pediatria "+formateador.format (presped));
          System.out.println("******************************************");
          
          System.out.println("gastos ginecologia ");
          gastgin=teclado.nextDouble();
          System.out.println("gastos traumatologia ");
          gasttraum=teclado.nextDouble();
          System.out.println("gastos pediatria ");
          gastped=teclado.nextDouble();
          System.out.println("******************************************");
          
          if(gastgin>prepgin){
              System.out.println("Excedio el presupuesto Ginecologia");
          }
          else{
              System.out.println("Buena Administracion del  presupuesto "
                      + "Ginecologia");
          }
          if(gasttraum>preptraum){
              System.out.println("Excedio el presupuesto Traumatologia");
          }
          else{
              System.out.println("Buena Administracion del  presupuesto "
                      + "Traumatologia");
          }
          if(gastped>presped){
              System.out.println("Excedio el presupuesto Pediatria");
          }
          else{
              System.out.println("Buena Administracion del  presupuesto "
                      + "Pediatria");
          }
          
         
        
    }
    
}
