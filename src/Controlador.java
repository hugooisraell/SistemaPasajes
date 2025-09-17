import java.util.ArrayList;
import java.util.Scanner;

/**
 * Proyecto: SistemaPasajes
 * Autor: Hugo Israel Láinez Medina
 * ID: 2400396574
 * Fecha de creación: domingo, 14 de septiembre de 2025
 */

public class Controlador {

    Scanner sn = new Scanner(System.in); // Escribir en consola

    // Lista para almacenar los buses
    ArrayList<Bus> listaBuses = new ArrayList<>();

    // Funcion que agrega buses por defecto
    public void busesPorDefecto() {
        listaBuses.add(new Bus(1,"YAA-4552", 45));
        listaBuses.add(new Bus(2,  "YAB-1001", 45));
        listaBuses.add(new Bus(3,  "YAC-2034", 45));
        listaBuses.add(new Bus(4,  "YAD-3145", 45));
        listaBuses.add(new Bus(5,  "YAE-4256", 45));
        listaBuses.add(new Bus(6,  "YAF-5367", 45));
        listaBuses.add(new Bus(7,  "YAG-6478", 45));
        listaBuses.add(new Bus(8,  "YAH-7589", 45));
        listaBuses.add(new Bus(9,  "YAI-8690", 45));
        listaBuses.add(new Bus(10, "YAJ-9701", 45));
        listaBuses.add(new Bus(11, "YAK-0812", 45));
        listaBuses.add(new Bus(12, "YAL-1923", 45));
        listaBuses.add(new Bus(13, "YAM-2034", 45));
        listaBuses.add(new Bus(14, "YAN-3145", 45));
        listaBuses.add(new Bus(15, "YAO-4256", 45));
        listaBuses.add(new Bus(16, "YAP-5367", 45));
        listaBuses.add(new Bus(17, "YAQ-6478", 45));
        listaBuses.add(new Bus(18, "YAR-7589", 45));
        listaBuses.add(new Bus(19, "YAS-8690", 45));
        listaBuses.add(new Bus(20, "YAT-9701", 45));
    }

    // Funcion para agregar buses
    public void agregarBus() {

        int numero; // numero/disco de bus
        String placa; // numero de placa
        int capacidad; // capacidad del bus

        System.out.println("---------------------------------------------------------");
        System.out.println("------------------- REGISTRO DE BUSES -------------------");
        System.out.println("---------------------------------------------------------");

        System.out.println(" Ingrese los datos del bus:");

        // Ingresar datos
        System.out.print("Número:      ");
        numero = sn.nextInt();
        sn.nextLine();

        System.out.print("Placa:       ");
        placa = sn.nextLine();
        placa = placa.toUpperCase(); // Convertir a mayusculas

        System.out.print("Capacidad:   ");
        capacidad = sn.nextInt();
        sn.nextLine(); // Salto de linea de consola

        System.out.println("---------------------------------------------------------");

        boolean agregado = listaBuses.add(new Bus(numero, placa, capacidad));

        if (!agregado) {
            System.out.println("---------------------------------------------------------");
            System.out.println("¡Error al agregar bus!");
            System.out.println("---------------------------------------------------------");
        } else {
            // Muestra el bus agregado
            System.out.println("---------------------------------------------------------");
            System.out.println("¡Bus agregado exitosamente!");
            System.out.println("---------------------------------------------------------");
            System.out.println("Número: " + numero + "   Placa: " + placa + "   Capacidad: " + capacidad);
            System.out.println("---------------------------------------------------------");
        }

    }

    // Funcion para ver los buses agregados
    public void verBuses() {


        System.out.println("---------------------------------------------------------");
        System.out.println("------------------ Buses Agregados ----------------------");

        System.out.println("| BUS    | PLACA            | CAPACIDAD");
        // Itera la lista de buses
        for (Bus bus : listaBuses) {
            System.out.println(bus.getNumero() + "          " +
                    bus.getPlaca() + "           " +
                    bus.getCapacidad());
        }
    }


}