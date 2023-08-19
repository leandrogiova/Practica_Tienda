import java.util.Scanner;

import models.Producto;

public class Application {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Producto p1 = new Producto();

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un id: ");
            Scanner entrada = new Scanner(System.in);
            p1.setIdentificador(entrada.nextLine());

            // p1.setIdentificador("ZX123");
            System.out.println("Identificador = " + p1.getIdentificador());
        }
    }

}
