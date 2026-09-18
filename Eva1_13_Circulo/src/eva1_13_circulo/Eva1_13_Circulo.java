/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_circulo;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_13_Circulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double rad, ar, pe, vol;
        Scanner captu = new Scanner(System.in);
        System.out.println("Teclee el Radio: ");
        rad = captu.nextDouble();
        pe = 2 * 3.1416 * rad;
        ar = 3.1416 * (rad * rad);
        vol = (3/4.0 * 3.1416) * (rad * rad * rad); 
        System.out.println("El radio es: " + rad);
        System.out.println("El perimetro es: "+ pe);
        System.out.println("El Area es: "+ ar);
        System.out.println("El volumen es: "+ vol);
    }
    
}
