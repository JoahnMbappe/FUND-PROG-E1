/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_7_Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ///El tipo de dato determina las operaciones
        //Enteros, reales, cadenas, logicos, etc.
        //Expresion
        //Valores
        //Variables
        //Operadores
        //Funciones
        //Que se evaluan para obtener un resultado 
        //Operaciones con numeros:
        //Aritmeticas;
        int suma, val1, val2; //Declaro 3 variables del mismo tipo
        //Asignacion: Poner un valor en una variable
        //Operador --> simbolo de igual que trabaja SOBRE identificadores
        // = --> asignacion --> poner valor
        // == --> comparacion
        val1 = 100; //Asignar el valor 100 a la variable 1
        val2 = 50;
        Scanner captu = new Scanner(System.in);
        suma = val1 + val2; //Expresion, asignar a la variable suma la operacion entre val1 y val2 (+)
        // + --> esta entre dos enteros, se interpreta como los que debe sumar
        System.out.print("Val 1: ");
        System.out.println(val1);
        System.out.print("Val 2: ");
        System.out.println(val2);
        System.out.println("suma: "+ suma);
        //Operaciones respetan matematicas
        //Multiplicacion
        // * 
        int multi;
        multi = val1 * val2;
        System.out.println("multiplicacion: "+ multi);
        //Division
        // / --> operador de division
        int divi;
        divi = val1/val2;
        System.out.println("division: "+ divi);
        val1= 10;
        val2= 3;
        divi = val1/val2;
        System.out.print("Val 1: ");
        System.out.println(val1);
        System.out.print("Val 2: ");
        System.out.println(val2);
        System.out.println("Division: "+ divi);
        double resu;
        resu = val1/val2;
         System.out.println("Division: "+ resu);
         double val2copia;
         val2copia = 3;
         resu = val1/ val2copia;
          System.out.println("Division: "+ resu);
        
    }
    
}
