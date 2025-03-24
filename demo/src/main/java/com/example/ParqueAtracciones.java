package com.example;

import java.util.ArrayList;
import java.util.List;

public class ParqueAtracciones {
    private List<Atraccion> listaAtracciones;
    private List<Empleado> listaEmpleados;
    private List<Visitante> listaVisitantes;

    public ParqueAtracciones(){
        this.listaAtracciones = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
        this.listaVisitantes = new ArrayList<>();
    }
    /** 
     * Agrega una atraccion nueva a la lista
     * @param atraccion
     */
    public void agregarAtraccion(Atraccion atraccion){
        listaAtracciones.add(atraccion);
        System.out.println(atraccion.getNombre()+" ha sido agregado");
    }
    /**
     * Agrega un empleado nuevo a la lista 
     * @param empleado
     */
    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        System.out.println(empleado.getNombre()+" ha sido agregado");
    }
    /** 
     * Agrega un visitante nuevo a la lista
     * @param visitante
     */
    public void agregarVisitante(Visitante visitante){
        listaVisitantes.add(visitante);
        System.out.println(visitante.getNombre()+" ha sido agregado");
    }
    /**
     * Muestra todas las atracciones en la lista
     */
    private void mostrarAtracciones(){
        for(Atraccion atraccion : listaAtracciones){
            System.out.println(atraccion);
        }
    }
    /**
     * Muestra todos los empleados en la lista
     */
    private void mostrarEmpleados(){
        for(Empleado empleado : listaEmpleados){
            System.out.println(empleado);
        }
    }
    /**
     *  Muestra todos los visitantes en la lista
     */
    private void mostrarVisitantes(){
        for(Visitante visitante : listaVisitantes){
            System.out.println(visitante);
        }
    }
    /**
     *  Muestra todas las listas
     */
    public void mostrarInformacionParque(){
        System.out.println("Atracciones: ");
        mostrarAtracciones();
        System.out.println("Empleados: ");
        mostrarEmpleados();
        System.out.println("Visitantes: ");
        mostrarVisitantes();
    }
}
