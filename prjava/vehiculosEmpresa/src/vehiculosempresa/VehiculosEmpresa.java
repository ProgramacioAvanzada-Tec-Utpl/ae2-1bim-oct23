/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculosempresa;

import Clases.clEmpresa;
import Clases.clVehiculo;
import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class VehiculosEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        clEmpresa cl_empresa = new clEmpresa();
        clVehiculo cl_vehiculo =new clVehiculo();

        while (true) {
            System.out.println("Menú de Opciones:");
            System.out.println("1. Agregar Vehículo");
            System.out.println("2. Modificar Vehículo");
            System.out.println("3. Eliminar Vehículo");
            System.out.println("4. Mostrar Vehículos");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese la placa: ");
                    String placa = scanner.next();
                    System.out.print("Ingrese el Propietario: ");
                    String propietario = scanner.next();
                    System.out.print("Ingrese cant de Ocupantes: ");
                    int cantOcup = scanner.nextInt();
                    System.out.print("Ingrese la Marca de Vehiculo: ");
                    String marca = scanner.next(); 
                    System.out.print("Ingrese la Modelo de Vehiculo: ");
                    String modelo = scanner.next();                    
                    System.out.print("Ingrese el año: ");
                    int anio = scanner.nextInt();
                    //cl_vehiculo nvoVehiculo=new cl_vehiculo();
                    cl_vehiculo nuevoVehiculo = new cl_vehiculo(placa, propietario, cantOcup, marca, modelo, anio);                    
                    cl_vehiculo.insertarVehiculo(nuevoVehiculo);
                    

                }
                case 2 -> {
                    System.out.print("Ingrese el índice del vehículo a modificar: ");
                    int indice = scanner.nextInt();
                    cl_vehiculo nuevoVehiculo;
                    String modelo;
                    int anio;
                    String marca;
                    if (indice >= 0 && indice < empresa.mostrarVehiculos()) {
                        System.out.print("Ingrese la marca: ");
                        marca = scanner.next();
                        System.out.print("Ingrese el modelo: ");
                        modelo = scanner.next();
                        System.out.print("Ingrese el año: ");
                        anio = scanner.nextInt();
                        nuevoVehiculo = new Vehiculo(marca, modelo, anio);
                        empresa.modificarVehiculo(indice, nuevoVehiculo);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                }
                case 3 -> {
                    System.out.print("Ingrese el índice del vehículo a eliminar: ");
                    int indice = scanner.nextInt();
                    if (indice >= 0 && indice < empresa.mostrarVehiculos()) {
                        empresa.eliminarVehiculo(indice);
                    } else {
                        System.out.println("Índice inválido.");
                    }
                }
                case 4 -> empresa.mostrarVehiculos();
                case 5 -> {
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                }
                default -> System.out.println("Opción no válida.");
            }
        }
    }
    
}
