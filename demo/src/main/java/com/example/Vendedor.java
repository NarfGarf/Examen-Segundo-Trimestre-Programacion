package com.example;

public class Vendedor extends Empleado {
    private int numVentasRealizadas = 0;// numVentasRealizadas es por defecto 0 ya que un nuevo vendedor nunca podrá empezar con ventas ya realizadas

    public Vendedor(String nombre, int idEmpleado) {
        super(nombre, idEmpleado, "Vendedor");
    }
    /**
     * Simula una venta de una entrada, aumentando el numero de ventas realizadas
     */
    public void venderEntrada(){
        System.out.println("Entrada vendida");
        numVentasRealizadas += 1;
    }
    /**
     * Reporta el numero de Ventas
     */
    public void reportarVentas(){
        System.out.println("Vendimos "+numVentasRealizadas+" entradas");
    }

    public int getNumVentasRealizadas() {
        return numVentasRealizadas;
    }

    public void setNumVentasRealizadas(int numVentasRealizadas) {
        this.numVentasRealizadas = numVentasRealizadas;
    }

}
