import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int cupoDisponible;
        String producto;
        int valor;
        boolean autorizado;

        //Configuración de la tarjeta
        System.out.println("Ingrese el cupo disponible:");
        cupoDisponible = Integer.parseInt(scanner.next());
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(cupoDisponible);

        //Entrando a la tienda
        int salir = 1;
        do {
            //Solicitud de datos
            System.out.println("Ingrese el producto:");
            producto = scanner.next();

            System.out.println("Ingrese el valor del producto:");
            valor = Integer.parseInt(scanner.next());

            //Crear instanacia de compra con los datos entregados
            Compra compra = new Compra(producto,valor);

            //Autorización
            if (tarjeta.autoriza(compra)) {
                System.out.println("Compra realizada!");
                System.out.println("Desea realizar otra compra? 0 = No : 1 = Si");
                salir = Integer.parseInt(scanner.next());
            } else {
                System.out.println("No hay saldo suficiente.");
                salir = 0;
            }

        } while (salir != 0);

        //finalizando la compra
        System.out.println("****** COMPRAS REALIZADAS ******");

        for (Compra compra : tarjeta.getListaDeCompra()){
            System.out.println("\t" + compra.getProducto() + " - " + compra.getValor());
        }

        System.out.println("--------------------------------");
        System.out.println("Contact me: @framirezj");

    }
}
