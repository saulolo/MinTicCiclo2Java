package JavaDummiesHerenciaInterfaz;


/* @author: Saulolo */

public class Guerrero extends Humano implements IAsignable{
    
    //Atributos
    private double ataque;
    

    
    //Constructor

    public Guerrero(String nombre, double ataque, char sexo, double vida, double defensa, double velocidad) {
        super(nombre, sexo, vida, defensa, velocidad);
        this.ataque = ataque;
    }
    
 
    //Métodos
    public void atacar(){
        
    }
    
    public void defender(){
        
    }
    

    @Override
    public String toString() {
        return "Guerrero{" + 
                "ataque=" + ataque + 
                '}';
    }
    
    
    
    //Getter and Setter
    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

  
        

}
    


