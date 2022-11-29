package JavaDummiesHerenciaInterfaz;

/* @author: Saulolo */

public class NPJ extends Humano{
    
    //Atributos
    private String profesion;


    //Constructor
    public NPJ(String nombre, char sexo, double vida, double defensa, double velocidad, String profesion) {
        super(nombre, sexo, vida, defensa, velocidad);
    }
    
    
    //Métodos
    public void hablar(){
        
    }

    @Override
    public String toString() {
        return "NPJ{" + 
                "profesion=" + profesion + '}';
    }
    
    
    
    
    
    
    //Getter and Setter
    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
            
    
    
    
    


}
