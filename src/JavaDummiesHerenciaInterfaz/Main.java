package JavaDummiesHerenciaInterfaz;

import java.util.Date;

/* @author: Saulolo */

public class Main {

    public static void main(String[] args) {
        
        Guerrero miGuerrero1 = new Guerrero("Saul", 50, 'M', 40, 60, 80);
        System.out.println(miGuerrero1.getAtaque());
        
        NPJ miNPJ1 = new NPJ("Carolina", 'M', 50, 30, 700, "Herrera");
        
        miGuerrero1.asignarMision(new Date(), "Salvar al reino");
        System.out.println(miGuerrero1.verMisiones());
        
        
        
        
      
        
    }
}
