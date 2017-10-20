package com.ricardo.abstracts;

import com.ricardo.abstractclass.Figure;

/**
 * En esta clase podemos ver un pequeño ejemplo sencillo de clases abstractas. Las clases
 * abstractas son clases para ser heredadas y se crean utilizando la palabra clave
 * abstract. Se puede declarar un metodo como abstract y definirlo en la subclase.
 * 
 * Se utiliza la clase padre para poder crear una clase que defina el metodo
 * "getFigureMeter" para obtener las medidas de un cuadrado.
 * 
 * @author Ricardo Carvajal
 * 
 */

public class MainAbstractsSquare extends Figure {

    /**
     * Constructor de la clase el cual implementa uno de los constructores de la clase
     * padre.
     * 
     * Este puede ser un ejemplo de sobrecarga de constructores.
     * 
     */
    public MainAbstractsSquare(int wide, int width) {
        super(wide, width);
    }

    /**
     * Metodo para iniciar la aplicacion
     * 
     * @return void
     */
    public static void main(String[] args) {

        MainAbstractsSquare square = new MainAbstractsSquare(20, 20);

        square.getFigureMeter();

    }

    /**
     * Metodo que devuelve las medidas de una figura. Este metodo se define en la clase
     * padre y la clase hija que herede la clase padre la tiene que definir
     * obligatoriamente.
     * 
     * @return void no devuelve valor.
     * 
     */
    @Override
    public void getFigureMeter() {

        System.out.println("Las medidas del cuadrado son:");
        System.out.println("Ancho: " + wide);
        System.out.println("Alto: " + wide);

    }

}
