package Reto3_AerolineaFlyCo;

/* @author: Saulolo */

public class mainAsiento {
    
    public static void main(String[] args) {
        
        Bronce miAsiento = new Bronce('b', "001");
        
        System.out.println(miAsiento.getInclinacionSilla());
        miAsiento.disminuirInclinacion(85);
        System.out.println(miAsiento.getInclinacionSilla());
        
    }

}
