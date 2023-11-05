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
public class clVehiculo {
    public String placa;
    public String propietario;
    public int cantOcup;
    public String marca;
    public String modelo;
    public int ayear;
    
    public clVehiculo() {}

    public clVehiculo(String placa, String propietario, int cantOcup, String marca, String modelo, int ayear) {
        this.placa = placa;
        this.propietario = propietario;
        this.cantOcup = cantOcup;
        this.marca = marca;
        this.modelo = modelo;
        this.ayear = ayear;
    }

    public String getPlaca() {
        return placa;
    }

    public String getPropietario() {
        return propietario;
    }

    public int getCantOcup() {
        return cantOcup;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAyear() {
        return ayear;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setCantOcup(int cantOcup) {
        this.cantOcup = cantOcup;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAyear(int ayear) {
        this.ayear = ayear;
    }
    
    //**************************************************************
    //**************************************************************
    
    // Métodos para operaciones CRUD

    // Insertar un nuevo vehículo en la lista
    public static void insertarVehiculo(List<clVehiculo> listaVehiculos, clVehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    // Borrar un vehículo de la lista por ID
    public static void borrarVehiculo(List<clVehiculo> listaVehiculos, String placa) {
        listaVehiculos.removeIf(vehiculo -> vehiculo.getPlaca().equals(placa));
    }

    // Actualizar un vehículo en la lista por ID
    public static void actualizarVehiculo(List<clVehiculo> listaVehiculos, String  placa, clVehiculo nuevoVehiculo) {
        for (int i = 0; i < listaVehiculos.size(); i++) {
            if (listaVehiculos.get(i).getPlaca().equals(placa)) {
                listaVehiculos.set(i, nuevoVehiculo);
                break;
            }
        }
    }

    // Eliminar todos los vehículos de la lista
    public static void eliminarTodosLosVehiculos(List<clVehiculo> listaVehiculos) {
        listaVehiculos.clear();
    }
    
    // Método para mostrar la información del vehículo
    public void mostrar() {
        System.out.println("Información del Vehículo:");
        System.out.println("Placa: " + placa);
        System.out.println("Propietario: " + propietario);
        System.out.println("Cant Ocupantes: " + cantOcup);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);        
        System.out.println("Año Fabricacion: " + ayear);
    }    
    
}
