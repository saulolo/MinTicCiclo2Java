package Reto3_Boton;

/* @author: Saulolo */

public class BotonPrueba extends Boton{

    
    
    
    //Constructor
    public BotonPrueba(double ancho, double altura, String colorFondo, String colorTexto, String texto) {
        super(ancho, altura, colorFondo, colorTexto, texto);
    }
    
    
    //Método
    @Override
    public void hacerClick(){
        setTexto("Hello World");
        
        
    }
    
    


}
