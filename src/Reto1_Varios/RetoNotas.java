package Reto1_Varios;

import java.util.*;


public class RetoNotas {
    
    public static void main(String[] args) {
        
                    //METODO 1: CON JAVA UTIL COLLECTION.//
        /*Importo la libreria de java.util para llamar los metodos max
        pero para ello debo definir el Arrays nombrado como Integer, luego
        llamo el método y despues convierto el Arrays a una lista con asList*/
                    
        Double [] listaNotas = {4.1, 3.8, 2.5, 3.0, 5.0, 1.7, 4.5, 2.2, 1.2, 1.5};
        
        double promedio = 0;
        double notaMayor = 0;
        double notaMenor = 0;
        double suma = 0;
        
        
        for(int i = 0; i < listaNotas.length; i++){
            suma = suma + listaNotas[i];
        }
        
        promedio = suma / listaNotas.length;
        
        notaMayor = Collections.max(Arrays.asList(listaNotas));
        System.out.println("La nota MAYOR es: " + notaMayor);
        
        notaMenor = Collections.min(Arrays.asList(listaNotas));
        System.out.println("La nota MENOR es: " + notaMenor);
        
        System.out.print("El PROMEDIO de las notas es: ");
        System.out.printf("%1.2f ", promedio);       
        
                         /* ¡¡¡ CONGRATULATIONS !!!*/
        
    }
    
}
