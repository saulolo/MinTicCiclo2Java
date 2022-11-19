package empleados;

import java.util.Scanner;

/* @author: Saulolo */

public class Empleados { 
    
    public static class empleado{ //Método constructor
        private String nombre;
        
        
        public empleado(String nombre){
            this.nombre = nombre;
            //System.out.println("Se construyo correctamente el empleado " + nombre);//se construye esta linea para verificar
        }

        public String getNombre() { //Método Get
            return nombre;
        }

        public void setNombre(String nombre) { //Método Set
            this.nombre = nombre;
            System.out.println("El empleado ahora se llama " + nombre);
        }
        
        //Método toString()
        //devuelve un string formado por las palabras que queremos y el atributo consultado
        @Override
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
            
            public String toString(){
                return super.toString();
            }
            
            //VOY MIN 30
            
            
        }
        
        
        
    
        
    } 

    public static void main(String[] args) { //Método principal
        Scanner input = new Scanner(System.in); //Creamos un objeto de tipo Scanner para hacer input
        empleado no1 = new empleado("Roberto");//Creamos el objeto empleado
        
        System.out.println("Ingrese el nuevo nombre: "); //Mostrar mensaje en pantalla pidiendo el nombre del nuevo empleado
        String nuevoNombre = input.nextLine(); //Nueva variable alimentada por el usuario
        
        no1.setNombre(nuevoNombre);
        System.out.println(no1.toString());
        
    }
}
