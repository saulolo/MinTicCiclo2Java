package Reto1_Videojuego;

/* @author: Saulolo */

public class Main {
    
    public static void main(String[] args) {
        
        Personaje miPersonaje1 = new Personaje("Superman", 'M');
        
        System.out.println(miPersonaje1.getNombre() + "  " +  miPersonaje1.getSexo());
        
        System.out.println(miPersonaje1.getNumeroBotiquines());
        
        System.out.println("******************************************");
        
        System.out.println(miPersonaje1.getVida());
        miPersonaje1.usarBotiquin();
        System.out.println(miPersonaje1.getVida());
        
    }

}
