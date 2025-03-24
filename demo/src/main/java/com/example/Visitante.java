package com.example;

public class Visitante {
    private String nombre;
    private int idVisitante;
    private int edad;
    
    public Visitante(String nombre, int idVisitante, int edad) {
        if(validarEdad(edad)){
        this.nombre = nombre;
        this.idVisitante = idVisitante;
        this.edad = edad;
        }
    }

    private boolean validarEdad(int edad){
        if(edad>0){
            return true;
        }else{
            System.out.println("Error, edad invalida");
            return false;
        }
    }
    
    public void comprarEntrada(){
        System.out.println("Entrada comprada!");
    }
    
    public void usarAtraccion(){
        System.out.println("Atraccion usada!");
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getIdVisitante() {
        return idVisitante;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIdVisitante(int idVisitante) {
        this.idVisitante = idVisitante;
    }

    public void setEdad(int edad) {
        if (validarEdad(edad)){
            this.edad = edad;
        }
    }
    @Override
    public String toString() {
        return "Visitante{" + "nombre=" + nombre + ", idVisitante=" + idVisitante + ", edad=" + edad + '}';
    }
}
