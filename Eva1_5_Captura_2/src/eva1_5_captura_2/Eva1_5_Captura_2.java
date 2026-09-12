/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_captura_2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_5_Captura_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaramos Las Variables
        String nombre;
        int Edad;
        Double Salario;
        //SCANNER
        Scanner captu = new Scanner(System.in);
        //CAPTURA
        System.out.println("Capture Nombre de Usuario: ");
        nombre = captu.nextLine(); //Lee el texto hasta el "Enter"
        System.out.println("Capture Edad del Usuario: ");
        Edad = captu.nextInt();
        System.out.println("Capture Salario: ");
        Salario = captu.nextDouble();
        System.out.print("El nombre es: "+ nombre);
        System.out.println(nombre);
        System.out.print("La edad es: "+ Edad);
        System.out.println(Edad);
        System.out.print("Tu Salario es:  "+ Salario);
        System.out.println(Salario);
    }
    
}
