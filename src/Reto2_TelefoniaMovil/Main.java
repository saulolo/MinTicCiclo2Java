package Reto2_TelefoniaMovil;

/* @author: Saulolo */
public class Main {

    public static void main(String[] args) {

        SIMCard sim1 = new SIMCard("123");

        sim1.setSaldo(50000.0);
        System.out.println(sim1.comprarDatos(10));

        System.out.println("Empresa telefonia: " + sim1.getEmpresaTelefonia());
        System.out.println("Saldo: " + sim1.getSaldo());
        System.out.println("Numero Telefono: " + sim1.getNumeroTelefono());
        System.out.println("Estado Celular: " + sim1.getCelularApagado());
        System.out.println("Estado Modo Avion: " + sim1.getModoAvionActivado());
        System.out.println("Estado Datos: " + sim1.getDatosActivados());
        System.out.println("Saldo Datos: " + sim1.getSaldoDatos());
    }

}
