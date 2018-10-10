/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_2;

import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Boletin2_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner ler=new Scanner(System.in);
    float fahrenheit=0f, kelvin=0f;
    System.out.println("Introduce Cº");
    float grados=ler.nextFloat();

  fahrenheit=(float)((grados*1.8)+32);
  kelvin=(float) (grados+273.15);
    
    System.out.println(grados +"Cº son "+ fahrenheit + "Fº y "+ kelvin+ " grados kelvin");
    }
    
}
