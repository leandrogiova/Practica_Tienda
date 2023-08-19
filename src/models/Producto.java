package models;

public class Producto {

    public final static int LONGITUD_CATEGORIA_NOMBRE = 2;
    public final static int LONGITUD_NUMERO_DE_PRODUCTO = 3;
    public final static int LONGITUD_IDENTIFICADOR = 5;

    private String categoria = new String(new char[LONGITUD_CATEGORIA_NOMBRE]);
    private Integer id_numero = new String(new char[LONGITUD_NUMERO_DE_PRODUCTO]);
    private String identificador = new String(new char[LONGITUD_IDENTIFICADOR]);

    public String getCategoria() {
    }

    /*
     * Funcion setCatgoria
     * Verifica que el nombre de la categoria sea de la longitud permitida
     * La longitud permitida esta almacenada en la constante "LONGITUD_CATEGORIA"
     */
    public void setCategoria(String categoria) {
        if (categoria.length() > 2) {
            System.out.println("El nombre de la categoria debe ser de 2 caracteres");
        } else {
            this.categoria = categoria;
        }
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {

        if (categoria.length() > 2) {
            System.out.println("El nombre de la categoria debe ser de 2 caracteres");
        } else {
            this.categoria = categoria;
        }

        /*
         * if (identificador.length() > 5) {
         * System.out.
         * println("El identificador puede contener solamente 5 caracteres alfanumericos"
         * );
         * } else {
         * this.identificador = identificador;
         * }
         */
    }

    public Producto() {

    }
}
