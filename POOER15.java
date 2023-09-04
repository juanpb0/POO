/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// Elabore un código que entre un numero y establezca su suacrado y su cubo.

package com.mycompany.pooer15;
import java.util.Scanner;
public class POOER15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un número : ");
        double num = entrada.nextDouble();
        double cuadrado = num * num;
        double cubo = cuadrado * num; 

        System.out.println("El cuadrado de " + num + " es " + cuadrado);
        System.out.println("El cubo de " + num + " es " + cubo);
    }
}
