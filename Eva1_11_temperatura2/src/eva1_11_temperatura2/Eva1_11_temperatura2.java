/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_temperatura2;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_11_temperatura2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, cel, kelv;
        Scanner far = new Scanner(System.in);
        System.out.println("Escriba la temperatura en Grados Farenheit: ");
        temp = far.nextDouble();
        cel = (temp -32)/1.8;
        kelv = (temp - 32)*5/9 + 273.15;
        System.out.println("La temperatura en grados Farenheit es: "+ cel);
        System.out.println("La temperatura en grados celsius es: "+ cel);
        System.out.println("La temperatura en grados kelvin es: "+ kelv);
    }
    
}
