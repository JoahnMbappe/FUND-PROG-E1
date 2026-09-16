/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_temperatura;

import java.util.Scanner;

/**
 *
 * @author bisonte
 */
public class Eva1_10_Temperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp, far, kelvin;
        Scanner tem = new Scanner(System.in);
        System.out.println("Introduce la temperatura en Centigrados: ");
        temp = tem.nextDouble();
         
        
        //Solicitar datos al usuario
        //hacer calculo
        far = temp * 1.8 + 32;
       kelvin = temp +273.15;
        //Mostrarr resultado al usuario
        System.out.println("Farenheit: " + far);
        System.out.println("Kelvin: " + kelvin);
        System.out.println(temp + "C = " + far + "F");
        System.out.println(temp + "C = " + kelvin + "K");
    }
    
}
