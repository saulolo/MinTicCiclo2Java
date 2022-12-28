package EjercicioProReto2Bacata;

/* @author: Saulolo */

public class Black extends Bacata{
    
    //Atributos
    private String[] beneficios = {"Maleta gratis", "Bebida gratis", "Sala VIP"};
    private boolean[] estadoBeneficios = {true, true, true}; 
    private boolean derechoVip = false;
    
    //Constructor
    public Black(String ID, String nombreUsuario, String email) {
        super(ID, nombreUsuario, email, 0.02);
    }
    
    //Métodos
    public boolean redimirBeneficios(int posicion){
        if(estadoBeneficios[posicion] == true){
            estadoBeneficios[posicion] = false;
            return true;
        }
        return false;
    }
    //Gettaer and Setter
    public String[] getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String[] beneficios) {
        this.beneficios = beneficios;
    }

    public boolean[] getEstadoBeneficios() {
        return estadoBeneficios;
    }

    public void setEstadoBeneficios(boolean[] estadoBeneficios) {
        this.estadoBeneficios = estadoBeneficios;
    }

    public boolean isDerechoVip() {
        return derechoVip;
    }

    public void setDerechoVip(boolean derechoVip) {
        this.derechoVip = derechoVip;
    }
    
    

}
