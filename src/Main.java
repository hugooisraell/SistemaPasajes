import java.util.Scanner;

/**
 * Proyecto: SistemaPasajes
 * Autor: Hugo Israel Láinez Medina
 * DNI: 2400396574
 * Fecha de creación: domingo, 14 de septiembre de 2025
 * Última modificación: lunes, 15 de septiembre de 2025
 */

public class Main {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in); // Escribir en consola
        boolean salir = false; // Opcion salir
        int opcion; // Decision del usuario

        // Menu de opciones
        do {

            System.out.println("---------------------------------------------------------");
            System.out.println("-------------------- SISTEMA PASAJES --------------------");

            // Opciones del menu
            System.out.println("1. Registrar bus");
            System.out.println("2. Registrar trabajador");
            System.out.println("3. Asignar turnos");
            System.out.println("4. Vender pasaje");
            System.out.println("5. Ver ventas");
            System.out.println("0. Salir");

            System.out.print("Escribe una de las opciones:     ");
            opcion = sn.nextInt(); // Guarda la opcion

            System.out.println("---------------------------------------------------------");

            // Manejar opciones
            switch (opcion) {
                case 1:
                    System.out.println("Registrar bus");
                    break;

                case 2:
                    System.out.println("Registrar trabajador");
                    break;

                case 3:
                    System.out.println("Asignar turnos");
                    break;

                case 4:
                    System.out.println("Vender pasaje");
                    break;

                case 5:
                    System.out.println("Ver ventas");
                    break;

                case 0:
                    // Finaliza el programa
                    System.out.println("Saliendo... ¡Gracias por elegirnos!");
                    System.out.println("---------------------------------------------------------");

                    salir = true;
                    break;

                default:
                    System.out.println("---------------------------------------------------------");
                    System.out.println("¡Opción Incorrecta! Intenta nuevamente.");
                    System.out.println("¡Recuerda escribir solo los números del menú!");
                    System.out.println("---------------------------------------------------------");
            }

        } while (!salir);

    }
}