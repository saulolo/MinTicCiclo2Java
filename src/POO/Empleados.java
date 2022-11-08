package POO;

/* @author: Saulolo */

public class Empleados {
    
    public static class empleado {   //Creación de una clase 
        private String nombre;
     
        
        public empleado(String nombre){  //el método constructor de esta clase
            this.nombre=nombre;           //debe tener el mismo nombre de la clase.
                                       
        }

        public String getNombre() {      //Método get
            return nombre;
        }

        public void setNombre(String nombre) {     //Método set
            this.nombre = nombre;
        }
        
        // Método toString{}
        //devuelve un string formado por las palabras que qiueremos y el 
        //atributo consultado.
        
        @Override //Me permite sobreescrinir un método.
        public String toString(){
            return "El empleado se llama " + nombre;
        }
        
    }
    
    
    public static void main(String[] args) {   //Método principal
        
    }

}
