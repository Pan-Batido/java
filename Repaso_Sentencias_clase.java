/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.repaso_sentencias;
import java.util.Scanner;

/**
 *
 * @author PV-Alumno
 */
public class Repaso_Sentencias {
    static Scanner input=new Scanner(System.in);

    public static void main(String[] args) {
        Sentencias sentencia1 = new Sentencias();
        double totalIVA;
//        System.out.println("Ingrese la cantidad de zapatos: ");
//        int cant= input.nextInt();
        Zapato zapato1= new Zapato("Sport","Negro", 43.5, 45990);
        System.out.println(zapato1.toString());
        totalIVA=zapato1.calcularPrecio(zapato1.getPrecio());
        System.out.println("El total a pagar es: "+ totalIVA);
        System.out.println(zapato1.color);
        //con el metodo se puede acceder a variables privadas
        System.out.println(zapato1.getColor());
        int edad = 19
        System.out.println("la edad es"+edad+ ",Es mayor?"+sentencia1.mayorDeEdad(edad));
        sentencia.ejemploFor();
        
    }
}
