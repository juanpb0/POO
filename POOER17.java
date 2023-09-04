/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Haga un algoritmo que a partir del radio de un circulo
// calcule el area y la longitud de su circunferencia.
package com.mycompany.pooer17;
import java.util.Scanner;
public class POOER17 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el radio del círculo : ");
        double radio = entrada.nextDouble();
        
        //Area del círculo:
        double area = Math.PI * (radio * radio);
        
        //Longitud de la circunferencia:
        double long_circ = 2 * Math.PI * radio;
        System.out.println("El área del circulo es " + area);
        System.out.println("La longitud de la circunferencia es " + long_circ);
    }
}
