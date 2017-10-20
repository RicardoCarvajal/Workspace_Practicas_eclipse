package com.ricardo.abstractclass;

/**
 * En esta clase podemos ver un pequeño ejemplo sencillo de clases abstractas. Las clases
 * abstractas son clases para ser heredadas y se crean utilizando la palabra clave
 * abstract. Se puede declarar un metodo como abstract y definirlo en la subclase.
 * 
 * @author Ricardo Carvajal
 * 
 */

public abstract class Figure {

    public Figure(int wide, int width, int diametre) {
        this.wide = wide;
        this.width = width;
        this.diametre = diametre;
    }

    public Figure(int diametre) {
        this.wide = 0;
        this.width = 0;
        this.diametre = diametre;
    }

    public Figure(int wide, int width) {
        this.wide = wide;
        this.width = width;
        this.diametre = 0;
    }

    /**
     * Campo de clase que almasena el ancho de la figura.
     * 
     */
    protected int wide;

    /**
     * Campo de clase que almasena el largo de la figura.
     * 
     */
    protected int width;

    /**
     * Campo de clase que almasena el diametro de la figura.
     * 
     */
    protected int diametre;

    /**
     * Metodo que devuelve las medidas de una figura. Este metodo se definira en las
     * clases hijas.
     * 
     * @return void no devuelve valor.
     * 
     */
    public abstract void getFigureMeter();

    /**
     * Metodo para obtener el ancho de una figura
     * 
     * @return numero tipo int
     */
    public int getWide() {
        return wide;
    }

    /**
     * Metodo para insertar el ancho de la figura
     * 
     * @param numero tipo int
     */
    public void setWide(int wide) {
        this.wide = wide;
    }

    /**
     * Metodo para obtener el alto de una figura
     * 
     * @return numero tipo int
     */
    public int getWidth() {
        return width;
    }

    /**
     * Metodo para insertar el alto de la figura
     * 
     * @param numero tipo int
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * Metodo para obtener el diametro de una figura
     * 
     * @return numero tipo int
     */
    public int getDiametre() {
        return diametre;
    }

    /**
     * Metodo para insertar el diametro de la figura
     * 
     * @param numero tipo int
     */
    public void setDiametre(int diametre) {
        this.diametre = diametre;
    }

}
