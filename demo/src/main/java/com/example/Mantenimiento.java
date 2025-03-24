package com.example;

public class Mantenimiento extends Empleado{
        
    private String areaResponsable;
    
    public Mantenimiento(String nombre, int idEmpleado,String areaResponsable){
        super(nombre,idEmpleado,"Mantenimiento");
        if(validarAreaResponsable(areaResponsable)){
            this.areaResponsable = areaResponsable;
        }else{
            System.out.println("No se pudo asignar el area responsable al de Mantenimiento");
        }
        
    }
    public void realizarMantenimiento(){
        System.out.println("Mantenimiento realizado!");
    }
    
    public void reportarProblema(){
        System.out.println("Problema reportado!");
    }
    
    private boolean validarAreaResponsable(String area){
        if(area.equalsIgnoreCase("Mecanica")||area.equalsIgnoreCase("Electrica")||area.equalsIgnoreCase("Limpieza")){
            return true;
        }else{
            System.out.println("Error, area responsable invalida");
            return false;
        }
    }

    public String getAreaResponsable() {
        return areaResponsable;
    }
    
    public void setAreaResponsable(String areaResponsable) {
        if(validarAreaResponsable(areaResponsable)){
            this.areaResponsable = areaResponsable;
        }
    }
}
