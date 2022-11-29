package Reto1_RifaElDePython;

import java.util.Scanner;

/* @author: Saulolo */

public class Rifa {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
       
        /*Usted y un grupo de amigos ha decidido realizar una rifa de 1'000.000
        de pesos para recaudar fondos en pro de los habitantes de la calle del 
        municipio en el que usted habita.*/
        
        System.out.println("RIFA (RETO CICLO PYTHON)");
        System.out.println("------------------------");
        
        int n = (int) ((Math.random() * 30) + 1);
        int b = 30;
        int intento;
        int acomulador = 0;
        
        
        while (true) {    
            
            System.out.println("Diga un número entre 0 y " + b);
            intento = input.nextInt();
            acomulador = acomulador + 1;
            
            if (intento > n) {
                System.out.println("¡Ups! Te pasaste");
            } else if (intento < n) {
                System.out.println("¡Ups! Estas por debajo");
            } else if (intento == n){
                System.out.println("¡LO LOGRASTE! usaste " + acomulador + " intentos");
                break;
            }
           
        }

    }

}
