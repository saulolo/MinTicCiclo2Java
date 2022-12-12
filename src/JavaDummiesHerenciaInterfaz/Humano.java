package JavaDummiesHerenciaInterfaz;

/* @author: Saulolo */

public abstract class Humano { //se define como clase abstracta para que no esta
                               //esta clase no se deje instanciar, ya que es una
                               // una super clase segun nuestra lógica.
    //Atributos
    private String nombre;
    private char sexo;
    private double vida;
    private double defensa;
    private double velocidad;
    
    //Constructor

    public Humano(String nombre, char sexo, double vida, double defensa, double velocidad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.vida = vida;
        this.defensa = defensa;
        this.velocidad = velocidad;
    }
    
    //Métodos
    public void caminar(){
        
    }

    @Override
    public String toString() {
        return "Humano{" + 
                "nombre=" + nombre + 
                ", sexo=" + sexo + 
                ", vida=" + vida + 
                ", defensa=" + defensa + 
                ", velocidad=" + velocidad + '}';
    }
    
    
    
    
    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    

    
    
    
}
