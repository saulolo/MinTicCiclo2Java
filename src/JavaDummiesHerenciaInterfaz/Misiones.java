package JavaDummiesHerenciaInterfaz;

import java.util.Date;

/* @author: Saulolo */

public class Misiones {

    //Atributos
    private Date fecha;
    private String Descripcion;

    
    //Constructor
    public Misiones(Date fecha, String Descripcion) {
        this.fecha = fecha;
        this.Descripcion = Descripcion;
    }
    
    //Getter and Setter
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    @Override
    public String toString() {
        return "Misiones{" + 
                "fecha=" + fecha + ", "
                + "Descripcion=" + Descripcion + '}';
    }
    
    
    
    
    
    
    
}
