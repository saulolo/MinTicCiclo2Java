package JavaParaDummiesPolimorfismo;

/* @author: Saulolo */

public abstract class Animal {
    
    //Atributos
    private String nombre;
    private int edad;
    private char sexo;
    private String raza;

    public Animal(String nombre, int edad, char sexo, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.raza = raza;
    }

    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    //Métodos
    public String comer() {
        return "Esta comiendo felíz.";
    }

    /*FORMAS DE DECLARA POLIMORFISMO:
    1. Que se sobreescriban métodos de la super clase.
    2. Que se defina la lógica de los métodos abstractos declarados en la super clase.
    Nota: en ambos métodos sale el Override
     */

    public abstract String caminar();
    
    //toString

    @Override
    public String toString() {
        return "Animal{" + 
                "nombre=" + nombre + 
                ", edad=" + edad + 
                ", sexo=" + sexo + 
                ", raza=" + raza + 
                '}';
    }
    
    

}
