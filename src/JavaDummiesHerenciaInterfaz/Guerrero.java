package JavaDummiesHerenciaInterfaz;

/* @author: Saulolo */

public class Guerrero {
    
    private String nombre;
    private char sexo;
    private double vida;
    private double defensa;
    private double ataque;
    private double velocidad;

    public Guerrero(String nombre, char sexo, double vida, double defensa, double ataque, double velocidad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
        this.velocidad = velocidad;
    }
    
    public void atacar(){
        
    }
    
    public void caminar(){
        
    }
    
    public void defender(){
        
    }

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

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
}
