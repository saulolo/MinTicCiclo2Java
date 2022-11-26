package empleados;

import empleados.Empleados.empleado.Operario;



/* @author: Saulolo */

public class Empleados { 
    
    public static class empleado{ //Método constructor
        private String nombre;
        
        
        public empleado(String nombre){
            this.nombre = nombre;
            //System.out.println("Se construyo correctamente el empleado " + nombre);//se construye esta linea para verificar
        }

        public String getNombre() { //Método Get
            return "Desde la clase empelados, heredado, vemos el nombre " + nombre;
        }

        public void setNombre(String nombre) { //Método Set
            this.nombre = nombre;
            //System.out.println("El empleado ahora se llama " + nombre);
        }
        
        //Método toString()
        //devuelve un string formado por las palabras que queremos y el atributo consultado
        //@Override
        public  String toString(){
            return "El empleado se llama " + nombre;
        }
        
        //Clase operario. Clase derivada de la clase empleado
        public static class Operario extends empleado{
            
            //Constructor de la clase operario
            public Operario(String nombre) { //Herede de mi superclase empleado
                super(nombre);
                System.out.println("Operario/Empelado creado");
            }
            
            //@Override  //Esten método sobreescribe al metodo toString de la clase superior
          //  public String toString(){
              //  return super.toString() + " y Es operario.";
           // }
            
           
            
            
        }
        
        
        
    
        
    } 

    public static void main(String[] args) { //Método principal
        
        empleado E1 = new empleado("Rafa");
        Operario OP1 = new Operario("Alfonso");
        //System.out.println(E1);
        System.out.println(OP1);
        
 
    }
}
