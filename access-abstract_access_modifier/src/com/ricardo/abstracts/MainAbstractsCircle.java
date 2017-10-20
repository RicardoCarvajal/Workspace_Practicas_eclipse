package com.ricardo.abstracts;

import com.ricardo.abstractclass.Figure;

/**
 * En esta clase podemos ver un pequeño ejemplo sencillo de clases abstractas. Las clases
 * abstractas son clases para ser heredadas y se crean utilizando la palabra clave
 * abstract. Se puede declarar un metodo como abstract y definirlo en la subclase.
 * 
 * Se utiliza la clase padre para poder crear una clase que defina el metodo
 * "getFigureMeter" para obtener las medidas de un circulo.
 * 
 * 
 * @author Ricardo Carvajal
 * 
 */

public class MainAbstractsCircle extends Figure {

    /**
     * Constructor de la clase el cual implementa uno de los constructores de la clase
     * padre.
     * 
     * Este puede ser un ejemplo de sobrecarga de constructores.
     * 
     */
    public MainAbstractsCircle(int diametre) {
        super(diametre);
    }

    /**
     * Metodo para iniciar la aplicacion
     * 
     * @return void
     */
    public static void main(String[] args) {

        MainAbstractsCircle circle = new MainAbstractsCircle(120);

        circle.getFigureMeter();

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

        System.out.println("El diametro del circulo son:");
        System.out.println("Diametro: " + diametre);

    }

}
