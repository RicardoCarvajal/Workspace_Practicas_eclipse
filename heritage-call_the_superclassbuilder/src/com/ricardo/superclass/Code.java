package com.ricardo.superclass;

/**
 * Esta clase nos da un ejemplo de herencias en Java y como se pueden hacer llamados a
 * constructores y metodos de la super clase. Esta es la super clase.
 * 
 * @author Ricardo Carvajal
 * 
 */

public class Code {

    /**
     * Campo de clase que almasena numero extra para formar un codigos con los campos
     * siguientes.
     * 
     */
    protected int number;

    /**
     * Campo de clase que almasena una ficha laboral.
     * 
     */
    protected int dataSheet;

    /**
     * Campo de clase que almasena una cedula de identidad indicada.
     * 
     */
    protected int id;

    /**
     * Campo de clase que almasena un codigo cualquiera.
     * 
     */
    protected int code;

    /**
     * Metodo para obtener el codigo
     * 
     * @return numero tipo int
     */
    public int getCode() {
        return code;
    }

    /**
     * Metodo para insertar el valor del codigo
     * 
     * @param numero tipo int
     */
    public void setCode(int code) {
        this.code = code;
    }

    /**
     * Metodo para obtener el numero
     * 
     * @return int
     */
    public int getNumero() {
        return number;
    }

    /**
     * Metodo para insertar el valor del numero
     * 
     * @paran numero tipo int
     */
    public void setNumero(int number) {
        this.number = number;
    }

    /**
     * Metodo para obtener la ficha
     * 
     * @return int
     */
    public int getFicha() {
        return dataSheet;
    }

    /**
     * Metodo para insertar el valor de la ficha
     * 
     * @param numero tipo int
     */
    public void setFicha(int dataSheet) {
        this.dataSheet = dataSheet;
    }

    /**
     * Metodo para obtener la cedula
     * 
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para insertar el valor de la cedula
     * 
     * @param numero tipo int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Metodo constructor el cual se usa para inicializar los campos de clase
     * 
     * @param 4 numero tipo int
     */
    public Code(int number, int dataSheet, int id, int code) {
        this.number = number;
        this.dataSheet = dataSheet;
        this.id = id;
        this.code = code;
    }

    /**
     * Metodo constructor el cual se usa para inicializar los campos de clase
     * 
     * Sobre carga de constructor
     * 
     * @param 3 numero tipo int
     */
    public Code(int number, int dataSheet, int id) {
        this.number = number;
        this.dataSheet = dataSheet;
        this.id = id;
    }

}
