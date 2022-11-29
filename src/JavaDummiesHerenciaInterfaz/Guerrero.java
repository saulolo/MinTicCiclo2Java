package JavaDummiesHerenciaInterfaz;

import java.util.ArrayList;
import java.util.Date;

/* @author: Saulolo */

public class Guerrero extends Humano{
    
    //Atributos
    private double ataque;
    private ArrayList<Misiones> misiones = new ArrayList<>();

    
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
    
    public void asignarMision(Date fecha, String descripcion){
        misiones.add(new Misiones(fecha, descripcion));
    }
    
    public ArrayList<Misiones> verMisiones(){
        return misiones;
    }

    @Override
    public String toString() {
        return "Guerrero{" + 
                "ataque=" + ataque + 
                ", misiones=" + misiones + '}';
    }
    
    
    
    //Getter and Setter
    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }
        

}
    


