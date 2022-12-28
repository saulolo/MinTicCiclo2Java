package Reto3_Boton;

/* @author: Saulolo */
public class mainBoton {
    
    public static void main(String[] args) {
        
        BotonPrueba miBoton1 = new BotonPrueba(2, 3, "Rojo", "Negro", "Hola a todos");
        
        System.out.println(miBoton1.getTexto());
        
        miBoton1.hacerClick();
        
        System.out.println(miBoton1.getTexto());
        
    }

}
