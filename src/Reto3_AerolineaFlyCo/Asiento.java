package Reto3_AerolineaFlyCo;

/* @author: Saulolo */

public abstract class Asiento {
    
    //Atributos
    private char tipo;
    private String ID;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncencida = false;
    private boolean luzAsistenciaEncendida = false;
    private boolean aireAcondicionadoEncendido = false;
    
    
   //Constructor 
    public Asiento(char tipo, String ID) {
        this.tipo = tipo;
        this.ID = ID;
    }
    
    
    //Métodos
    public void gestionarAireAcondicionado(){
        
    }
    
    public void gestionarPantalla(){
        
    }
    
    public void gestionarLuzLectura(){
        
    }
    
    public void gestionarLuzAsistencia(){
        
    }
    
    public void aumentarInclinacion(double d){
        inclinacionSilla = inclinacionSilla + d;
        
    }
    
    public void disminuirInclinacion(double d){
        inclinacionSilla = inclinacionSilla - d;
        if (inclinacionSilla -d < 0){
            inclinacionSilla = 0;
        }
        else{
            inclinacionSilla -= d;
        }
    }
    
    public abstract String imprimirMenuPantalla();
    
    
    //Getter and Setter
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public boolean isPantallaEncendida() {
        return pantallaEncendida;
    }

    public void setPantallaEncendida(boolean pantallaEncendida) {
        this.pantallaEncendida = pantallaEncendida;
    }

    public double getInclinacionSilla() {
        return inclinacionSilla;
    }

    public void setInclinacionSilla(double inclinacionSilla) {
        this.inclinacionSilla = inclinacionSilla;
    }

    public boolean isLuzLecturaEncencida() {
        return luzLecturaEncencida;
    }

    public void setLuzLecturaEncencida(boolean luzLecturaEncencida) {
        this.luzLecturaEncencida = luzLecturaEncencida;
    }

    public boolean isLuzAsistenciaEncendida() {
        return luzAsistenciaEncendida;
    }

    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida) {
        this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }

    public boolean isAireAcondicionadoEncendido() {
        return aireAcondicionadoEncendido;
    }

    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido) {
        this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
    
    
    
    
}




