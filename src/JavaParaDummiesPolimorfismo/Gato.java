package JavaParaDummiesPolimorfismo;

/* @author: Saulolo */

public class Gato extends Animal implements IDormir{

    //Atributos
    private boolean independiente;
    
    
    //Constructor
    public Gato(boolean independiente, String nombre, int edad, char sexo, String raza) {
        super(nombre, edad, sexo, raza);
        this.independiente = independiente;
    }

    //Getter and Setter
    public boolean isIndependiente() {
        return independiente;
    }

    public void setIndependiente(boolean independiente) {
        this.independiente = independiente;
    }
    
    
    //Metodos
    public String caer(){
        return "El gato ha caido de pie";
    }
    
    //toString
    @Override
    public String toString() {
        return "Gato{" + "independiente=" + independiente + '}';
    }
    
    @Override
    public String caminar() {
        return "quiero descanzar, hoy o voy a caminar";
    }
    


}
