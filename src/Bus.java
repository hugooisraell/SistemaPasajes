/**
 * Proyecto: SistemaPasajes
 * Autor: Hugo Israel Láinez Medina
 * ID: 2400396574
 * Fecha de creación: domingo, 14 de septiembre de 2025
 */

public class Bus {

    private int numero; // numero/disco de bus
    private String placa; // numero de placa
    private int capacidad; // capacidad del bus
    private boolean[] asientos =  new boolean[capacidad]; // identificar asiento ocupado o no

    public Bus(int numero, String placa, int capacidad) {
        this.numero = numero;
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean[] getAsientos() {
        return asientos;
    }

    public void setAsientos(boolean[] asientos) {
        this.asientos = asientos;
    }
}