package JavaParaDummies;

/* @author: Saulolo */

public class SuperPersonaje {
    
    //1.Atributos (Caracteristicas)
    private String nombre; //Si no le pongo private, por defecto es publico
    private String poder;  //private quiere decir que yo no pueda acceder a estos
    private int edad;      // atributos, fuera de esta clase, casi siempre 
    private double valorComercial;  //deberian estar en private
    private boolean tieneAlas;
    private char genero;
    private String equipo;
    private double nivelDePoder;
    private int vidas;
    
    //2. Constructor: generar un objeto y lo inizializa.

    public SuperPersonaje(String nombre, String poder, double valorComercial, boolean tieneAlas) { //Se pone los atributos que querramos inizializar.
        this.nombre = nombre;
        this.poder = poder;
        this.valorComercial = valorComercial;
        this.tieneAlas = tieneAlas;
    }
    
    //2.1. Si mis atributos son privates, tengo que generar los getter y setter

    public String getNombre() { //Los getter siempre me retornan el valor del atributo
        return nombre; //es opcional poner o no el this. aqui
    }


    public String getPoder() {
        return poder ;
    }

    public double getValorComercial() {
        return valorComercial;
    }
    
    

    public void setValorComercial(double valorComercial) { //Los setter me permiten modficar
        if(valorComercial > 0){                     //los atributos de la clase con unas
            this.valorComercial = valorComercial;  //reglas especificas, y no retornan
        }
        
        
     }
    
    
    //3.Metodos (acciones)
    public void correr(){
        System.out.println("El jugador esta corriendo");
        
    }
    
    public void atacar(){
        
    }
    
    public void saltar(){
        
    }
    
    public void defender(){
        
    }
    
    public void volar(){
        
    }
    
    public void jugar(){
        
    }
    

}
