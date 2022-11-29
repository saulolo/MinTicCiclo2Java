package Reto2_TelefoniaMovil;

/* @author: Saulolo */

public class SIMCard {

    private String EmpresaTelefonia = "HI";
    private double saldo = 0;
    private String numeroTelefono;
    private boolean celularApagado = true;
    private boolean modoAvionActivado = false;
    private boolean datosActivados = false;
    private int saldoDatos = 0;

    public SIMCard(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getEmpresaTelefonia() {
        return EmpresaTelefonia;
    }

    public void setEmpresaTelefonia(String empresaTelefonia) {
        EmpresaTelefonia = empresaTelefonia;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public Boolean getCelularApagado() {
        return celularApagado;
    }

    public void setCelularApagado(Boolean celularApagado) {
        this.celularApagado = celularApagado;
    }

    public Boolean getModoAvionActivado() {
        return modoAvionActivado;
    }

    public void setModoAvionActivado(Boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }

    public Boolean getDatosActivados() {
        return datosActivados;
    }

    public void setDatosActivados(Boolean datosActivados) {
        this.datosActivados = datosActivados;
    }

    public int getSaldoDatos() {
        return saldoDatos;
    }

    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }

    //METODOS
    public int comprarDatos(int c) {
        int costo = 0;
        if (c <= 10) {
            costo = c * 3000;
            if (costo < saldo) {
                saldo -= costo;
                saldoDatos += c;
            }
        } else if (c <= 30) {
            costo = 3000 * 10 + 2500 * (30 - 10 - c);
            if (costo < saldo) {
                saldo -= costo;
                saldoDatos += c;
            }
        } else {
            costo = 3000 * 20 + 1500 * (c - 20);
            if (costo < saldo) {
                saldo -= costo;
                saldoDatos += c;
            }
            System.out.println("Nuevo saldo es;" + saldo + " Nuevo saldo datos " + saldoDatos);
        }

        return costo;
    }

    public void consumirDatos(int c) {
        if (modoAvionActivado == false && celularApagado == true) {
            saldoDatos -= c;

        }
    }

    public void llamar(int s) {
        double costo = 0;
        if (modoAvionActivado == false && celularApagado == true) {
            if (s <= 60) {
                costo = s * 1;
                if (costo < saldo) {
                    saldo -= costo;
                }
            } else if (s >= 60) {
                costo = 1 * 60 + 0.5 * (s - 60);
                if (costo < saldo) {
                    saldo -= costo;
                }
            }

        }

    }

    public void recargarSaldo(int s) {
        saldo += s;
    }

    public void gestionarEncendidoCelular() {
        celularApagado = !celularApagado;
        if (celularApagado == true) {
            modoAvionActivado = false;
            datosActivados = false;
        } else {
            modoAvionActivado = false;
            datosActivados = false;
        }
    }

    public void gestionarModoAvion() {
        modoAvionActivado = !modoAvionActivado;
        if (modoAvionActivado == true) {
            modoAvionActivado = false;
            datosActivados = false;
        } else {
            modoAvionActivado = false;
            datosActivados = false;
        }
    }

    public void gestionarDatos() {
        datosActivados = !datosActivados;
        if (datosActivados == true) {
            modoAvionActivado = false;
            datosActivados = false;
        } else {
            modoAvionActivado = false;
            datosActivados = false;
        }

    }

}
