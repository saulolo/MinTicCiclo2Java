package JavaDummiesHerenciaInterfaz;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Saulolo
 */
public interface IAsignable {
    
    ArrayList<Misiones> misiones = new ArrayList<>();
    
    //Declaración del método y los defino con la lógica con el modificador default
    default public void asignarMision(Date fecha, String descripcion){
        misiones.add(new Misiones(fecha, descripcion));
    } 

    default public ArrayList<Misiones> verMisiones(){
        return misiones;
    }

}
