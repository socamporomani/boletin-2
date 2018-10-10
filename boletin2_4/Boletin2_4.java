/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;
import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Boletin2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler =new Scanner(System.in);
        int b100=0,b20=0,b5=0,m1=0;
        System.out.println("introduce el dinero para contar");
        int dinero=ler.nextInt();
        while(dinero>=100){
            dinero=dinero-100;
            b100++;
        }
         while(dinero>=20){
            dinero=dinero-20;
            b20++;
        }
          while(dinero>=5){
            dinero=dinero-5;
            b5++;
        }
           while(dinero>=1){
            dinero=dinero-1;
            m1++;
        }
        System.out.println("son "+b100+" de 100€ "+b20+" de 20€"+ b5+" de 5€ "+m1+ " moneda de 1€");
        
        
    }
    
}
