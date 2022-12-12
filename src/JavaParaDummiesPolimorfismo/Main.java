package JavaParaDummiesPolimorfismo;

/* @author: Saulolo */

public class Main {
    
    public static void main(String[] args) {
        
        Perro miPerro = new Perro("Teo", 8, 'M', "labrador");
        System.out.println(miPerro.caminar());
        
        miPerro.setFiel(true);
        System.out.println(miPerro.isFiel());
        
        miPerro.hablar();
        
        Gato miGato = new Gato(true, "Michin", 5, 'F', "Angora");
        System.out.println(miGato.caer());
        
        Canario miCanario = new Canario("Piolin", 10, 'M', "Americano");
        
        
        System.out.println("************************");
        System.out.println(miGato.comer());
        System.out.println(miPerro.comer());
        System.out.println("-----");
        System.out.println(miPerro);
        System.out.println(miGato);
        
        
        System.out.println(miGato.dormir());
        System.out.println(miPerro.dormir());
        
        System.out.println("************");
        
        //Voy a crear un Array para hacer polimorfismo de clases
        Animal misAnimales[] = new Animal[3];
        misAnimales[0] = miPerro;
        misAnimales[1] = miGato;
        misAnimales[2] = miCanario;
        
        Animal miAnimal = new Perro("Tony", 10, 'M', "Doberman");
        System.out.println(miAnimal.comer());

    }

}
