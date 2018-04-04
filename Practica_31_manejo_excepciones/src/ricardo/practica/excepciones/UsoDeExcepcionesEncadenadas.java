package ricardo.practica.excepciones;

public class UsoDeExcepcionesEncadenadas {

    public static void main(String[] args) {

        try {
            metodo1();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

    }

    public static void metodo1() throws Exception {
        try {
            metodo2();
        } catch (Exception exception) {
            throw new Exception("La excepcion se lanzo en el metodo 1", exception);
        }
    }

    public static void metodo2() throws Exception {
        try {
            metodo3();
        } catch (Exception exception) {
            throw new Exception("La excepcion se lanzo en el metodo 2", exception);
        }
    }

    public static void metodo3() throws Exception {
        throw new Exception("La excepcion se produc en el metodo 3");
    }

}
