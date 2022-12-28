package Reto3_EduCursos;

/* @author: Saulolo */

public class Estudiante extends Persona{

    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }
    
    
    @Override
    public void dirigir(){
        String url = getUrl();
        String idioma = getIdioma();
        String estudiante = getNombre();
        
        String cadenaFnal = url + "/" + idioma + "/" + estudiante;
        setUrl(cadenaFnal);
        
    }

    
    
    
    

}
