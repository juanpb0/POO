/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

//  Un empleado trabaja 48 horas en la semana a razón de $5.000 hora. 
//El porcentaje de retención en la fuente es del 12,5% del salario bruto. 
//Se desea saber cuál es el salario bruto, la retención en la
//fuente y el salario neto del trabajador. 

package com.mycompany.pooer12;

public class POOER12 {

    public static void main(String[] args) {
        double salario_hora = 5000.0;
        int horas_trabajadas = 48;
        double retencion_f = 12.5;
        
        //Salario bruto:
        double salario_bruto = salario_hora * horas_trabajadas;
        
        //Retefuente (Se requiere %) :
        double retefuente = (retencion_f/100) * salario_bruto;
        
        // Salario neto:
        double salario_neto = salario_bruto - retefuente;
        
         System.out.println("Salario bruto : " + salario_bruto + " COP");
         System.out.println("Retención en la fuente : " + retefuente + " COP");
         System.out.println("Salario Neto : " + salario_neto + " COP"); 
    }
}
