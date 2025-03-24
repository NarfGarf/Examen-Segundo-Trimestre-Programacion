package com.example;

public class Vendedor extends Empleado {
    private int numVentasRealizadas = 0;

    public Vendedor(String nombre, int idEmpleado) {
        super(nombre, idEmpleado, "Vendedor");
    }
    
    public void venderEntrada(){
        System.out.println("Entrada vendida");
        numVentasRealizadas += 1;
    }
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
