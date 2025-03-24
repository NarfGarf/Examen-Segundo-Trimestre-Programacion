package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ParqueAtracciones parque = new ParqueAtracciones();
        Scanner ooo = new Scanner(System.in);
        System.out.println("Bienvenido al menu del Parque de Atracciones");
        boolean isDone = false;
        do{
            System.out.println("Que quieres hacer?");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Atraccion");
            System.out.println("3. Agregar Visitante");
            System.out.println("4. Mostrar toda la Informacion del parque");
            System.out.println("5. Salir");
            try{
            int userChoice = ooo.nextInt();
            switch(userChoice){
                case 1:
                    System.out.println("Dame estos parametros: ");
                    System.out.println("Nombre: ");
                    String nombreEmpleado = ooo.next();
                    System.out.println("ID:");
                    int IdEmpleado = ooo.nextInt();
                    System.out.println("Puesto:");
                    String puestoEmpleado = ooo.next();
                    Empleado empleado = new Empleado(nombreEmpleado,IdEmpleado,puestoEmpleado);
                    parque.agregarEmpleado(empleado);
                    
                    break;
                case 2:
                    System.out.println("Dame estos parametros: ");
                    System.out.println("Nombre: ");
                    String nombreAtraccion = ooo.next();
                    System.out.println("Capacidad:");
                    int capacidadAtraccion = ooo.nextInt();
                    System.out.println("Estado:");
                    String estadoAtraccion = ooo.next();
                    Atraccion atraccion = new Atraccion(nombreAtraccion, capacidadAtraccion, estadoAtraccion);
                    parque.agregarAtraccion(atraccion);

                    break;
                case 3:
                    
                    System.out.println("Dame estos parametros:");
                    System.out.println("Nombre:");
                    String nombreVisitante = ooo.next();
                    System.out.println("ID:");
                    int idVisitante = ooo.nextInt();
                    System.out.println("Edad:");
                    int edadVisitante = ooo.nextInt();
                    Visitante visitante = new Visitante(nombreVisitante, idVisitante, edadVisitante);
                    parque.agregarVisitante(visitante);
                    
                    break;
                case 4:
                    parque.mostrarInformacionParque();
                    break;
                case 5:
                    isDone = true;
                    break;
            }
            }catch(InputMismatchException e){
                System.out.println("Error: "+ e);
                ooo.nextLine();
            }
        }while(!isDone);
        ooo.close();
    }
}