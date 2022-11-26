package Reto1_Videojuego;

/* @author: Saulolo */

public class Personaje {
    
    //1. Atributos
    private String nombre; 
    private char sexo; 
    private double posicionX = 0; 
    private double posicionY = 0; 
    private double distanciaTotal = 0; 
    private int numeroBotiquines = 0; 
    private double vida = 100; 
    
    //2. Constructor

    public Personaje(String nombre, char sexo) {
        this.nombre = nombre;
        this.sexo = sexo;

    }
    
    //3. Setter y Getter
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

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public double getDistanciaTotal() {
        return distanciaTotal;
    }

    public void setDistanciaTotal(double distanciaTotal) {
        this.distanciaTotal = distanciaTotal;
    }

    public int getNumeroBotiquines() {
        return numeroBotiquines;
    }

    public void setNumeroBotiquines(int numeroBotiquines) {
        this.numeroBotiquines = numeroBotiquines;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }
    
    
    //4. Métodos
    public void usarBotiquin(){
        numeroBotiquines = numeroBotiquines - 1;
        vida = vida + 5;
    }
    
    public void recogerBotiquin(){
        numeroBotiquines = numeroBotiquines + 1;
    }
    
    public void moverDerceha(double d){
        posicionX = posicionX + d;
        distanciaTotal = distanciaTotal + d;
    }
    
    public void moverIzquierda(double d){
        posicionX = posicionX - d;
        distanciaTotal = distanciaTotal - d;
    }
    
    public void moverArriba(double d){
        posicionY = posicionY + d;
        distanciaTotal = distanciaTotal + d;
    }
    
    public void moverAbajo(double  d){
        posicionY = posicionY - d;
        distanciaTotal = distanciaTotal + d;
    }
    
    public double calcularDistanciaRespectoOrigen(){
        return distanciaTotal - (posicionX + posicionY);
        //la formula de la raiz
    }
    
    
    
    
    

    
    
    

}
