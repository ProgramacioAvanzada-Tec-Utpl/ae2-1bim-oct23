/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.List;
/**
 *
 * @author Asus
 */
public class clEmpresa {
    public String nombre;
    public String direccion;
    public String ciudad;
    
    public clEmpresa()
    {}

    public clEmpresa(String nombre, String direccion, String ciudad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
        //**************************************************************
    //**************************************************************
    
    // Métodos para operaciones CRUD

    // Insertar un nuevo vehículo en la lista
    public static void insertarEmpresa(List<clVehiculo> listaEmpresa, clVehiculo empresa) {
        listaEmpresa.add(empresa);
    }

    // Borrar un vehículo de la lista por ID
    public static void borrarEmpresa(List<clEmpresa> listaEmpresa, String nombre) {
        listaEmpresa.removeIf(empresa -> empresa.getNombre().equals(nombre));
    }

    // Actualizar un vehículo en la lista por ID
    public static void actualizarEmpresa(List<clEmpresa> listaEmpresa, String  nombre, clEmpresa nuevaEmpresa) {
        for (int i = 0; i < listaEmpresa.size(); i++) {
            if (listaEmpresa.get(i).getNombre().equals(nombre)) {
                listaEmpresa.set(i, nuevaEmpresa);
                break;
            }
        }
    }

    // Eliminar todos los vehículos de la lista
    public static void eliminarTodosLasEmpresas(List<clEmpresa> listaEmpresa) {
        listaEmpresa.clear();
    }
    
    // Método para mostrar la información del vehículo
    public void mostrarEmpresa() {
        System.out.println("Información de Empresa:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Direccion: " + direccion);
        System.out.println("Ciudad: " + ciudad);

    }    

    
}
