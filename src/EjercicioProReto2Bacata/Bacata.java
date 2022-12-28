package EjercicioProReto2Bacata;

/* @author: Saulolo */

public class Bacata { //CLASE PRINCIPAL
    
    //Atributos
    private String ID; 
    private String nombreUsuario; 
    private String email; 
    private double porcentajeMillas; 
    
    
    //Constructor
    public Bacata(String ID, String nombreUsuario, String email, double porcentajeMillas) {
        this.ID = ID;
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.porcentajeMillas = porcentajeMillas;
    }
    
    
     //Métodos
    public double[] calcularMillas(double porMillas, double valor){
        double millasAcum = 0;
        double bono = 0;
        double[] respuesta = new double[2];
        if (porMillas == 0.01) {  //Platinum
            millasAcum = valor * porMillas;
            bono = millasAcum * 70;
        } 
        else if(porMillas == 0.02){ //Black
            millasAcum = valor * porMillas;
            bono = millasAcum * 90;
        }
        respuesta[0] = millasAcum;
        respuesta[1] = bono;
        return respuesta;
    }
    
    
    //Getter and Setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPorcentajeMillas() {
        return porcentajeMillas;
    }

    public void setPorcentajeMillas(double porcentajeMillas) {
        this.porcentajeMillas = porcentajeMillas;
    }
  

    
    
    //Main
    public static void main(String[] args) {
        
        Platinum TPL = new Platinum("001", "Saul Echeverri", "saul@gmail.com"); //Cree la tarjeta
        System.out.println(TPL.getCantidadUsos());  //Cantidad de usos con tarjeta nueva
        System.out.println(TPL.isDerechoVip());  //Derecho al VIP con tarheta nueva
        TPL.usar(20000);  //Usar tarjeta
        TPL.usar(20000);  //Usar tarjeta
        TPL.usar(20000);  //Usar tarjeta
        TPL.usar(20000);  //Usar tarjeta
        System.out.println("Use mi tarjeta de crédito y las millas qye gané: " + TPL.usar(20000)[0]);  
        System.out.println(TPL.getCantidadUsos());  //Cantidad de usosahora
        System.out.println(TPL.isDerechoVip());
        
        System.out.println("--------------");
        System.out.println(" ");
        
        Black TBL = new Black("002", "Lola Lopez", "lolita@gmail.com");
        System.out.println("Tengo derecho a mi beneficio 2?, Tengo derecho a volverla a usar?");
        System.out.println(TBL.getEstadoBeneficios()[1]);  //Redimi el beneficio
        System.out.println("Redimi beneficio 2, Tengo derecho a volverla a usar?");
        TBL.redimirBeneficios(1);  //Redmi el beneficio.
        System.out.println(TBL.getEstadoBeneficios()[1]);
        
        
    }

}
