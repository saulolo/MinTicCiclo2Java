package Reto1_Practica;

/* @author: Saulolo */
public class Practica1 {

    /*Doña Juana, tiene 7 hijos, y ha querido junto con ellos aprender java, uno
    de los ejercicios propuestos para esta practica es, meter en un arreglo las 
    edades de todos los miembros de su familia. Quiere crear un proyecto que, 
    recibiendo dicho arreglo, le retorne un arreglo que tenga en su primera 
    posición la suma de todas las edades de los miembros de su hogar, en la 
    segunda pocisión la edad del miembro mas joven de su hogar y por ultimo la 
    edad del miembro con mas edad en su hogar.*/
    public static int[] familia(int[] edades) {

        //Busquemos al mas joven
        int joven = edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] < joven) {
                joven = edades[i];
            }
        }

        //Busquemos al myor
        int mayor = edades[0];
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] > mayor) {
                mayor = edades[i];
            }
        }

        //Sumamos todas las edades
        int suma = 0;
        for (int i = 0; i < edades.length; i++) {
            suma = suma + edades[i];
        }

        int[] respuesta = new int[3]; //Creamos un array de enteros solo con3 elementos
        respuesta[0] = suma;
        respuesta[1] = joven;
        respuesta[2] = mayor;

        return respuesta;
    }

    public static void main(String[] args) {//Probamos el código que este bien

        int[] ages = {23, 14, 6, 7, 8, 31, 16};//Datos de nuestra

        int[] respuesta = familia(ages);//creamos el array donde se guarde el arreglo
        //respueta al ejecutar la función familiua con ages
        //como argumento.

        for (int i = 0; i < respuesta.length; i++) {//Recoremos el arreglo respuesta

            System.out.println(respuesta[i]);//Imprimimos cada valor de mi arreglo.

        }
    }
}
