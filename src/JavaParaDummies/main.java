package JavaParaDummies;

/* @author: Saulolo */

public class main {
    
    public static void main(String[] args) {
        //4.Creabdo Objetos
        
        SuperPersonaje miPersonaje = new SuperPersonaje("JuanMa", "teletransportarse", 50000, false);
        System.out.println(miPersonaje.getNombre()); //Como contrui los getter, me aparece getNombre para imprimir en pantalla.
        System.out.println(miPersonaje.getPoder()); 
        
        miPersonaje.setValorComercial(-78); //para modificar el valor comercial tengo que setearlo
        System.out.println(miPersonaje.getValorComercial());
        
        miPersonaje.setValorComercial(56);
        System.out.println(miPersonaje.getValorComercial());
        
        miPersonaje.correr();  //no pongo el print porque esta en el metodo correr.
        
        
        
        
        /*Nota: si pongo el toString puedo imprimir tota la información de mi
        constructor sin utilizar uno por uno los getter (se hace para ahorrar
        tiempo) pero lo debo de crear desde la clase y del main accedo a él.*/
        
        
        
        


        
        
    }

}
