package com.example;

public class Empleado {
    private String nombre;
    private int idEmpleado;
    private String puesto;
    private String tarea="";
    
    public Empleado(String nombre, int idEmpleado, String puesto) {
        if(validarPuesto(puesto) && validarId(idEmpleado)){
            this.nombre = nombre;
            this.idEmpleado = idEmpleado;
            this.puesto = puesto;
        } else{System.out.println("No se pudo crear el Empleado");}
    }

    
    /** 
     * Se fija que la tarea esté vacia antes de asignar
     * @param tarea
     */
    public void asignarTarea(String tarea){
        if(this.tarea.isEmpty()){
            this.tarea = tarea;
        }else{
            System.out.println("Error, ya hay una tarea asignada");
        }
    }
    /**
     * Simula la realizacion de una tarea
     * Deja vacio el atributo tarea para que se pueda asignar una tarea nueva
     */
    public void realizarTarea(){
        this.tarea = "";
    }
    
    
    /** 
     * Valida si el puesto es uno de los tres puestos validos (Mantenimiento,Vendedor o Seguridad)
     * @param puesto
     * @return boolean
     */
    private boolean validarPuesto(String puesto){
        if(puesto.equalsIgnoreCase("Mantenimiento")||puesto.equalsIgnoreCase("Vendedor")||puesto.equalsIgnoreCase("Seguridad")){
            return true;
        }else{
            System.out.println("Error, puesto invalido");
            return false;
        }
    }
    
    
    /** 
     * Verifica que el id sea valido(mayor o igual a 0)
     * @param id
     * @return boolean
     */
    private boolean validarId(int id){
        if(id>=0){
            return true;
        }else{
            System.out.println("Error,ID invalido");
            return false;
        }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", idEmpleado=" + idEmpleado + ", puesto=" + puesto + ", tarea=" + tarea + '}';
    }
    
}
