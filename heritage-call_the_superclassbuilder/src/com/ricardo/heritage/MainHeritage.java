package com.ricardo.heritage;

import com.ricardo.superclass.Code;

/**
 * Esta clase nos da un ejemplo de herencias en Java y como se pueden hacer llamados a
 * constructores de la super clase o hacer referencia a los propios. Esta es la sub clase.
 * 
 * @author Ricardo Carvajal
 * 
 */

public class MainHeritage extends Code {

    /**
     * Campo de clase que almasena la combinacion de todos los numeros.
     * 
     */
    private int code;

    /**
     * Metodo constructor el cual se usa para inicializar los campos de clase y super
     * clase
     * 
     * @param 4 numero tipo int
     */
    public MainHeritage(int number, int dataSheet, int id, int codes) {
        super(number, dataSheet, id, codes);
    }

    /**
     * Metodo constructor el cual se usa para inicializar los campos de clase y super
     * clase
     * 
     * @param 3 numero tipo int
     */
    public MainHeritage(int number, int dataSheet, int id) {
        super(number, dataSheet, id);
        this.code = super.number + super.id + super.dataSheet;
    }

    /**
     * 
     * Comienza la ejecucion de la clase. Se inicializa el constructor de tres formas
     * diferentes.
     * 
     * Se utilizan dos constructores en el primero se inicializa directamente el campo
     * code con la llamada al contructor de la super clase utilizando la palabra reservada
     * super. En el siguiente constructor el campo code se inicializa utilizando la
     * palabra reservada this lo que indica que se inicializa el campo code de la
     * sub-clase.
     * 
     */
    public static void main(String[] args) {

        MainHeritage initOne = new MainHeritage(1685, 19652, 21032652, 1);

        MainHeritage initTwo = new MainHeritage(1526, 16952, 16772439);

        System.out.println(initTwo.code);

        System.out.println(initOne.getCode());

    }

}
