package com.ricardo.main;

/**
 * Esta clase nos da un ejemplo de la utilizacion de el ocultamiento de campos en JAVA.
 * 
 * @author Ricardo Carvajal
 * 
 */

public class Main {

    /**
     * Campo de clase el cual solo deberia ser modificado por el metodo usarCampo.
     * 
     */
    private static int x = 1;

    /**
     * 
     * Comienza la ejecucion de la clase. Se crea e inicializa la variable local X.
     * Implementa los metodos usarCampo y usarvariableLocal .
     * 
     */
    public static void main(String[] args) {

        /**
         * Variable local X la cual oculta el campo de clase X.
         * 
         */
        int x = 5;

        System.out.println("Mostrando variable local en metodo main: " + x);

        usarVariableLocal();
        usarCampo();
        usarVariableLocal();
        usarCampo();

        System.out.println("Mostrando variable local en metodo main: " + x);

    }

    /**
     * Metodo usarCampo utiliza el campo de clase X y lo modifica. Luego de modificalo lo
     * crea.
     * 
     */
    public static void usarCampo() {

        System.out.println("Mostrando campo de la clase en metodo usarcampo: " + x);

        x *= 10;

        System.out.println("Mostrando campo de la clase en metodo usarcampo: " + x);

    }

    /**
     * Metodo usarVariableLocal utiliza la variable local X y lo modifica. Luego de
     * modificalo lo crea.
     * 
     */
    public static void usarVariableLocal() {

        int x = 25;

        System.out.println("Mostrando variable local en metodo userVariableLocal: " + x);

        ++x;

        System.out.println("Mostrando variable local en metodo userVariableLocal: " + x);

    }

}
