package models;

public class Producto {

    public final static int LONGITUD_IDENTIFICADOR = 5;

    private String identificador = new String(new char[LONGITUD_IDENTIFICADOR]);

    public String getIdentificador() {
        return identificador;
    }

    /*
     * Funcion setIdentificador va a setear el identificador(va a ser obligatorio
     * que contenga 2caracteres y 3 numeros).
     * Convierte un string a un array de chars, luego comprueba que tenga un largo
     * de 5 caracteres
     * Luego verifica que los dos primeros caracteres sean letras y si son
     * minusculas los transforma
     * a mayusculas
     * Luego verifica que los 3 siguientes caracteres sean numeros
     * Si cumple con todas las condisiones se setea el valor correspondiente.
     * 
     * 
     * 
     * 
     * 
     * 
     * 
     * CAMBIAR EL VALOR DE 5 POR LA CONSTANTE LONGITUD DEL IDENTIFICADOR
     * 
     */

    public void setIdentificador(String identificador) {

        char[] chars = identificador.toCharArray();

        if (identificador.length() == LONGITUD_IDENTIFICADOR) {
            if (Character.isLetter(chars[0]) || Character.isLetter(chars[1])) {

                // las convierte en mayusculas
                if (Character.isLowerCase(chars[0])) {
                    chars[0] = Character.toUpperCase(chars[0]);
                }
                if (Character.isLowerCase(chars[1])) {
                    chars[1] = Character.toUpperCase(chars[1]);
                }

                // comprobar que los otros 3 digitos sean numeros
                for (int i = 2; i < LONGITUD_IDENTIFICADOR; i++) {
                    if (!Character.isDigit(chars[i])) {
                        System.out.println("Del 3er al 5 caracter no es un numero");
                        break;
                    } else {
                        this.identificador = new String(chars);
                    }
                }
            } else {
                System.out.println(
                        "Los dos primeros caracteres del identifiador deben ser letras.Ejemplo de identificador: AB123");
            }
        } else {
            System.out.println("El identificador debe contener solamente 2 letras y 5 numeros OBLIGATORIAMENTE");
        }

    }

    public Producto() {

    }
}
