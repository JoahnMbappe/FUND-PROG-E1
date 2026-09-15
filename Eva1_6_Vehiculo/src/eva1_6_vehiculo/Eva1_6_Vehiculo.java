/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_vehiculo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_6_Vehiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Marca, Modelo, Color;
        int Ano, Kilometraje;
        Double Precio;
        Scanner gtr = new Scanner(System.in);
        System.out.println("Capture marca de vehiculo: ");
        Marca = gtr.nextLine();
        System.out.println("Capture Modelo del vehiculo: ");
        Modelo = gtr.nextLine();
        System.out.println("Capture Ano del vehiculo: ");
        Ano = gtr.nextInt();
        gtr.nextLine();
        System.out.println("Capture Color del vehiculo: ");
        Color = gtr.nextLine();
        System.out.println("Capture Kilometraje del vehiculo: ");
        Kilometraje = gtr.nextInt();
        System.out.println("Capture Precio del vehiculo: ");
        Precio = gtr.nextDouble();
        
        System.out.print("El Marca del vehiculo es: ");
        System.out.println(Marca);
        System.out.print("El Modelo del vehiculo es: ");
        System.out.println(Modelo);
        System.out.print("El Ano del vehiculo es: ");
        System.out.println(Ano);
        System.out.print("El Color del vehiculo es: ");
        System.out.println(Color);
        System.out.print("El Kilometraje del vehiculo es: ");
        System.out.println(Kilometraje);
        System.out.print("El Precio del vehiculo es: ");
        System.out.println(Precio);
    }
    
}
