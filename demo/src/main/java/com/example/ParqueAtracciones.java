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

    public void agregarAtraccion(Atraccion atraccion){
        listaAtracciones.add(atraccion);
        System.out.println(atraccion.getNombre()+" ha sido agregado");
    }

    public void agregarEmpleado(Empleado empleado){
        listaEmpleados.add(empleado);
        System.out.println(empleado.getNombre()+" ha sido agregado");
    }
    public void agregarVisitante(Visitante visitante){
        listaVisitantes.add(visitante);
        System.out.println(visitante.getNombre()+" ha sido agregado");
    }
    private void mostrarAtracciones(){
        for(Atraccion atraccion : listaAtracciones){
            System.out.println(atraccion);
        }
    }
    private void mostrarEmpleados(){
        for(Empleado empleado : listaEmpleados){
            System.out.println(empleado);
        }
    }

    private void mostrarVisitantes(){
        for(Visitante visitante : listaVisitantes){
            System.out.println(visitante);
        }
    }
    public void mostrarInformacionParque(){
        System.out.println("Atracciones: ");
        mostrarAtracciones();
        System.out.println("Empleados: ");
        mostrarEmpleados();
        System.out.println("Visitantes: ");
        mostrarVisitantes();
    }
}
