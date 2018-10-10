/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;
import java.util.Scanner;

/**
 *
 * @author socamporomani
 */
public class Boletin2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner ler =new Scanner(System.in);
 float soldoBruto ,comision, soldoLiquido;
 System.out.println("introduce el sueldo fijo");
 float soldoFixo=ler.nextFloat();
 System.out.println("Introduce el total de ventas generadas");
 float ventas =ler.nextFloat();
 comision=(float)(ventas*0.05);
 System.out.println("Km recorridos");
 float km =ler.nextFloat();
 km=km*2;
 System.out.println("Dias fuera");
 float dias=ler.nextFloat();
 dias=dias*30;
 soldoBruto=soldoFixo+comision+km+dias;
 //En la siguiente linea calculo el irpf + la retención para luego restarsela al bruto
 soldoLiquido=(float)(soldoBruto*0.18)+36;
 soldoLiquido=soldoBruto-soldoLiquido;
 System.out.println("El sueldo bruto es de "+soldoBruto+" y el sueldo líquido es de "+ soldoLiquido +"€");
 
 
 
    }
    
}
