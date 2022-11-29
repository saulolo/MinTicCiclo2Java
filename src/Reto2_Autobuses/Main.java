package Reto2_Autobuses;

/* @author: Saulolo */
public class Main {

    public static void main(String[] args) {

        Autobus camion1 = new Autobus("Pepe", 30, false);

        System.out.println("Nombre del conductor: " + camion1.getNombreConductor());
        System.out.println("Número de pasajeros: " + camion1.getnPasajeros());
        System.out.println("Cantidad de dinero: " + camion1.getCantidadDinero());
        System.out.println("Número máximo de pasajeros: " + camion1.getnMaximoPasajeros());
        System.out.println("Localización en X: " + camion1.getLocalizacionX());
        System.out.println("Localización en Y: " + camion1.getLocalizacionY());
        System.out.println(camion1.isPuertaAbierta());
        System.out.println(camion1.isAireAcondicionadoActivado());
        System.out.println(camion1.isMotorEncendido());
        System.out.println(camion1.isWifiEncendido());
        System.out.println(camion1.isEnMarcha());

    }
}
