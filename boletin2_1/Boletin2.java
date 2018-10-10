/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;
import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Boletin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        float descuento;
        System.out.println("Introduce el precio original");
        float precioNormal=ler.nextFloat();
        System.out.println("introduce el precio pagado");
        float precioPagado=ler.nextFloat();
        descuento=(precioPagado-precioNormal)/precioNormal*100;
        
        System.out.println("el descuento es:"+descuento+"%");
    
        
    }
    
}
   
