package Reto1_Varios;

public class Solution{
    public static int [] reporte(int [] participantes){
        
    int nunMax = participantes[0];
    int numMin = participantes[0];
    int contador = 0;
        
    for (int i = 0; i < participantes.length; i++) {
        contador += 1;
            
        if (participantes[i] > nunMax) {
            nunMax = participantes[i];
        } else if (participantes[i] < numMin) {
            numMin = participantes[i];
        }
    }
    int [] competidores = {contador, numMin, nunMax};
    return competidores;
    }
}
