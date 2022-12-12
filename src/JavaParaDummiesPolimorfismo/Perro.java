package JavaParaDummiesPolimorfismo;

/* @author: Saulolo */
public class Perro extends Animal implements IDormir{

    public Perro(String nombre, int edad, char sexo, String raza) {
        super(nombre, edad, sexo, raza);
    }
    
    private boolean Fiel;
    
    
    //Getter and Setter
    public boolean isFiel() {
        return Fiel;
    }

    public void setFiel(boolean esFiel) {
        this.Fiel = esFiel;
    }
    
    
    public String hablar(){
        return "guau guau woof woof";
    }
    
    @Override //Polimorfismo
    public String comer(){ //Le cambio la forma al metodo de la clase que esta heredando.
        return "El perro esta comiendo de forma acelerada.";
    }
    
    /*FORMAS DE DECLARA POLIMORFISMO:
    1. Que se sobreescriban métodos de la super clase.
    2. Que se defina la lógica de los métodos abstractos declarados en la super clase.
    Nota: en ambos métodos sale el Override
    */
    
    //ToString
    @Override
    public String toString() {
        return "Perro{" + 
                "Fiel=" + Fiel + 
                '}';
    }
    
    @Override
    public String caminar(){
        return "vamos a dar un paseo al parque";
    }
    
    
    @Override
    public String dormir(){//Tambine puedo aplicar polimorfismos en interfaces
        return "El perro duerme placenteramente";
    }
    
    
    
    
    
    
    
    


}
