package Reto1_Varios;

import java.util.Arrays;

public class MiReto {
    
    public static void main(String[] args) {
        
            //METODO 4: CON POSICIÓN DEL ARRAYS DESPUES DE ORGANIZARLO//
        
        int [] resultados = {18, 20, 22, 19, 25, 21, 25, 24, 30};
        
        Arrays.sort(resultados); //llamo este metodo que me permite organizar
                                 // una lista de forma ascendente
                                 
        for (int i = 0; i < resultados.length; i++){
        }
        int listaCompleta = resultados.length; //asi se imprimen toda la lista
        int numMax = resultados[resultados.length - 1];
        int numMim = resultados[(0)];
        
        System.out.println("El tiempo maximo de llegada fue: " + numMax);
        System.out.println("El tiempo mínimo de llegada fue: " + numMim);
        System.out.println("La lista organizada es: " + Arrays.toString(resultados));
        
        int [] participantes = {listaCompleta, numMim, numMax};
        System.out.println(Arrays.toString(participantes)); //Asi se imprime 
                                                            //una array
        
                        /* ¡¡¡ CONGRATULATIONS !!!*/
    }
        
}      

    
