package Reto3_Boton;

/* @author: Saulolo */

public abstract class Boton {
    
    //Atributos
    private double ancho;
    private double altura;
    private String colorFondo;
    private String colorTexto;
    private String texto;
    
    
    //Constructor
    public Boton(double ancho, double altura, String colorFondo, String colorTexto, String texto) {
        this.ancho = ancho;
        this.altura = altura;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
    }
    
    //Métodos
    public abstract void hacerClick();
    
    //Getter and Setter
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorTexto() {
        return colorTexto;
    }

    public void setColorTexto(String colorTexto) {
        this.colorTexto = colorTexto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    

}
