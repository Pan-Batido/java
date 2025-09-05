/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.biblioteca;
import java.util.Scanner;

/**
 *
 * @author PV-Alumno
 * para crear el autor, debe pedri los datos (no dentro del main)
 * la edad del autoe debe ser entre 30 y 99
 * para crear el libro, pedir los datos tb
 * la categoria debe ser terror, aventura, infaltil
 * el añodel libro de be ser mayoe a 1920, pero no mayor al año acural
 * 
 * crear un programa de play
 * los objeto son
 * juegos;nombre,anio,categoria,studio
 *  origen(pais), anioInicio
 */
public class Biblioteca {
     static Scanner leer= new Scanner(System.in);

    public static void main(String[] args) {
        Verifica v=new Verifica();
        
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el nombre del autor: ");
        String nombre = leer.next();
        System.out.println("ingrese la editorial:");
        String editoral = leer.next();  
        do{
            System.out.println("ingrese la edad del autor: ");
            int edad = leer.next();
        }        
        while(!v.verificarEdad(edad,30,99));
     // clase objeto                       constructor
//        Autor autor1= new Autor();
//        Libro libro1= new Libro("Call of Kthulu", "Terror", autor1, 1984);
////        System.out.println(libro1.toString());
//        libro1.prestamo(libro1);
////        System.out.println(libro1.toString());
//        libro1.prestamo(libro1);
////        System.out.println(libro1.toString());
//        libro1.devolver(libro1);
////        System.out.println(libro1.toString());
//        
    }
    
}
