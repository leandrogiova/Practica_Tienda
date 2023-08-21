import java.util.Scanner;

import models.Producto;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Producto p1 = new Producto();

        p1.setIdentificador("ZX123");
        System.out.println("Identificador = " + p1.getIdentificador());
    }

}
