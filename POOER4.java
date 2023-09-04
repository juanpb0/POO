/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pooer4;
import java.util.Scanner;
public class POOER4 {

    public static void main(String[] args) {
        int edmama, edalber, edana, edjuan; //Edad de Juan
        System.out.println("Ingrese la edad de Juan");
        Scanner entrada = new Scanner(System.in);
        edjuan = entrada.nextInt();
        edalber = 2 * (edjuan/3); // Edad de Alberto
        edana = 4 * (edjuan/3); // Edad de Ana
        edmama = edjuan + edalber + edana; //edad de mama
        System.out.println("Juan = " + edjuan);
        System.out.println("Alberto = " + edalber);
        System.out.println("Ana = " + edana);
        System.out.println("Mama = " + edmama);
        }
}
