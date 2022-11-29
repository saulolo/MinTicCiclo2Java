package Reto1_Varios;

public class RetoTienda {
    
    public static void main(String[] args) {
        
        
                    //METODO 3: UTILIZANDO FOR Y CONDICIONALES//

        int compra [] = {2500, 4000, 3800, 600, 2000, 18000, 13500, 1500, 800, 
            12800, 31900, 1700, 15300, 100, 21200};
        
        int total = 0;
        int prodCostoso = 0;
        int prodBarato = compra [0]; //siempre asignamos la 1ra posición
        //independiente si es esl numero mayor o menor del array.
        
        for (int i = 0; i < compra.length; i++){
            total = total + compra[i];
            if (prodCostoso < compra[i]){
                prodCostoso = compra[i];
            }else if (prodBarato > compra[i]){
                prodBarato = compra[i];
            }
        }
        System.out.println("El TOTAL de la compra es: " + total);
        System.out.println("El producto mas COSTOSO es: " + prodCostoso);
        System.out.println("El producto mas BARATO es: " + prodBarato);
        
                        /* ¡¡¡ CONGRATULATIONS !!!*/
    }
    
}
        
    
        
