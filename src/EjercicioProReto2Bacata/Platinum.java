package EjercicioProReto2Bacata;

/* @author: Saulolo */

public class Platinum extends Bacata{
    
    //Atributos
    private int cantidadUsos = 0;
    private boolean derechoVip = false;
    
    
    //Constructor
    public Platinum(String ID, String nombreUsuario, String email) {
        super(ID, nombreUsuario, email, 0.01);
    }
    
    public double[] usar(double valor) {
        cantidadUsos = cantidadUsos + 1;  //cantidadusos
        if (cantidadUsos == 5) {
            derechoVip = true;
        }
        double porMillas = this.getPorcentajeMillas();

        return super.calcularMillas(porMillas, valor);
    }

    
    //Getter and Setter
    public int getCantidadUsos() {
        return cantidadUsos;
    }

    public void setCantidadUsos(int cantidadUsos) {
        this.cantidadUsos = cantidadUsos;
    }

    public boolean isDerechoVip() {
        return derechoVip;
    }

    public void setDerechoVip(boolean derechoVip) {
        this.derechoVip = derechoVip;
    }
    
    
     
}






    
    
    


    
    
    


