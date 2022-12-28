package Reto3_EduCursos;

/* @author: Saulolo */

public class mainPersona {
    
    public static void main(String[] args) {
        
        Estudiante miEstudiante1 = new Estudiante("001", "Camila", "cami@gmail.com", "Español");
        
        System.out.println(miEstudiante1.getUrl());
        
        miEstudiante1.dirigir();
        
        System.out.println(miEstudiante1.getUrl());
        
    }

}
