package com.example;

public class Atraccion {
    private String nombre;
    private int capacidad;
    private String estado;

    public Atraccion(String nombre, int capacidad, String estado) {
        if(validarEstado(estado)){
            this.nombre = nombre;
            this.capacidad = capacidad;
            this.estado = estado;
        }
    }

    private boolean validarEstado(String estado){
        if(estado.equalsIgnoreCase("Operativa")||estado.equalsIgnoreCase("En_Mantenimiento")||estado.equalsIgnoreCase("Fuera_De_Servicio")){
            return true;
        }else{
            System.out.println("Error, estado invalido");
            return false;
        }
    }
    public void iniciarAtraccion(){
        System.out.println("Inicio de Atraccion!");
    }
    public void detenerAtraccion(){
        System.out.println("Fin de Atraccion!");
    }
    public void cambiarEstado(String estado){
        if (validarEstado(estado)){
            setEstado(estado);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Atraccion{");
        sb.append("nombre=").append(nombre);
        sb.append(", capacidad=").append(capacidad);
        sb.append(", estado=").append(estado);
        sb.append('}');
        return sb.toString();
    }
    
}
