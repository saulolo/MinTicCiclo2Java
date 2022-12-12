package JavaDummiesHerenciaInterfaz;

/* @author: Saulolo */

public class Mago extends Humano implements IAsignable{
    
    //Atributos
    private double nivelMagia;
    

    //Constructor
    public Mago(String nombre, char sexo, double vida, double defensa, double velocidad, double nivelMagia) {
        super(nombre, sexo, vida, defensa, velocidad);
        this.nivelMagia = nivelMagia;
    }
    
    
    //Getter and Setter
    public double getNivelMagia() {
        return nivelMagia;
    }

    public void setNivelMagia(double nivelMagia) {
        this.nivelMagia = nivelMagia;
    }
    
    
    //Métodos
    public void hechizar(){
        
    }

}
