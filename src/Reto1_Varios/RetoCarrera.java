package Reto1_Varios;

import java.util.*;

public class RetoCarrera {
    
    
    public static void main(String[] args) {
        
                        //METODO 2: CON FOR EACH Y MATH.//
                        
         //Revizar que pasa que no me quiere dar               
        
        int [] resultados  = {18, 29, 22, 25, 16, 26, 21,23, 20};
        
        int participantes = 0;
        int menorTiempo = resultados[0];   
        int mayorTiempo = 0;
        
        
        System.out.println("Los PARTICIPANTS son: " + Arrays.toString(resultados)); 
        /*Asi puedo mostar el  contenido de un array, pero debo de importar 
        java.util.Arrays para usar este método*/
        
        for(int i:resultados){  //Recorriendo con el for each
            mayorTiempo = Math.max(mayorTiempo, i);
            menorTiempo = Math.min(menorTiempo, i);
        }
    
        System.out.println("El MAYOR tiempo fue: " + mayorTiempo);
        System.out.println("El MENOR tiempo fue: " + menorTiempo);  
        
        
                         /* ¡¡¡ CONGRATULATIONS !!!*/
        
    }
    
}
