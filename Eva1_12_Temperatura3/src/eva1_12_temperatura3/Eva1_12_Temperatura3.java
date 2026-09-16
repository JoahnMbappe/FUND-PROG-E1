/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_12_temperatura3;

import java.util.Scanner;

/**
 *
 * @author taran
 */
public class Eva1_12_Temperatura3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double temp, cel, far;
        Scanner tem = new Scanner(System.in);
        System.out.println("Escriba la temperatura en Grados Kelvin: ");
        temp = tem.nextDouble();
        cel = temp - 273.15;
        far = temp * 9/5 - 459.67;
        
        System.out.println("La temperatura en Kelvin es: " + temp);
         System.out.println("La temperatura en Celcius es: " + cel);
          System.out.println("La temperatura en Farenheit es: " + far);
        
    }
    
}
