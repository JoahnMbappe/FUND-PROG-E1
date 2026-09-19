/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_formulageneral;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_14_formulageneral {

    public static void main(String[] args) {

        // Declarar
        double a, b, c, x1, x2;
       String Nombre = "Tarango De Santiago Joahn Haziel, Joahn Mbappe";
        Scanner captu = new Scanner(System.in);

        // Capturar
        System.out.println("Ingrese el Valor de a: ");
        a = captu.nextDouble();

        System.out.println("Ingrese el Valor de b: ");
        b = captu.nextDouble();

        System.out.println("Ingrese el Valor de c: ");
        c = captu.nextDouble();

        // Calcular
        x1 = (-1 * b + Math.sqrt((b * b) - (4* a * c))) / (2* a);
        x2 = (-1 * b - Math.sqrt((b * b) - (4 * a * c))) / (2 * a);

        // Mostrar
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println("Mi nombre y apodo: " + Nombre);
    }
}

