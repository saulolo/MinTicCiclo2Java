package Reto2_Autobuses;

/* @author: Saulolo */
public class Autobus {

    //Atributos
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    private int distanciaAutobus;

    //Constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros, boolean puertaAbierta) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.puertaAbierta = puertaAbierta;
    }

    //Getter and Setter
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    
    //Métodos
    public void recojerPasajero(int estrato) {
        int pasajePagado = 0;
        cantidadDinero = cantidadDinero + pasajePagado;
    }

    public void dejarPasajero() {
        nPasajeros = nPasajeros - 1;

    }

    public double calcularDistanciaAcopio() {
        return distanciaAutobus - (Math.sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2)));
        
    }

    public void gestionarPuerta() {
       if (puertaAbierta != puertaAbierta);
    }

    public void gestionarAireAcondicionado() {
       if (aireAcondicionadoActivado != aireAcondicionadoActivado);

    }

    public void gestionarMotor() {
        if (motorEncendido != motorEncendido);

    }

    public void gestionarWifi() {
        if(wifiEncendido != wifiEncendido);

    }

    public void gestionarMarcha() {
        if(enMarcha != enMarcha);

    }

    public void moverDerecha(double d) {
        localizacionX = localizacionX + d;

    }

    public void moverIzquierda(double d) {
        localizacionX = localizacionX - d;

    }

    public void moverArriba(double d) {
        localizacionY = localizacionY + d;

    }

    public void moverAbajo(double d) {
        localizacionY = localizacionY - d;

    }

    void isAireAcondicionado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void isgestionarMotor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
