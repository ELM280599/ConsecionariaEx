package consecionaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Consecionaria co = new Consecionaria("Los Monolitos", "Los Andes 57", 217846135);
        Auto a1 = new Auto(1, "JBC 123", "Ford Focus", 2010, 100450.00, 160200.00, "En Venta", 3, "rojo");
        Auto a2 = new Auto(2, "FXA 145", "Renault Clio", 2005, 120450.00, 210580.00, "En Venta", 5, "verde oscuro");
        Auto a3 = new Auto(3, "KUL 654", "Renault Fluence", 2011, 450230.00, 520570.45, "En Venta", 5, "negro");
        Camion c1 = new Camion(4, "LAE 984", "Volvo FMX", 2012, 1504302.45, 1600000.46, "En Venta", 6, 49000);
        Camion c2 = new Camion(5, "MAG 764", "Volvo FH", 2013, 1704230.50, 1900000.00, "En Venta", 6, 51000);
        Camion c3 = new Camion(6, "LZA 793", "Volvo XFA4", 2012, 2564230.50, 3100050.00, "En Venta", 8, 50000);
        Scanner entrada = new Scanner(System.in);

        boolean salir = false;
        int opcion;

        do {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1.Agregar autos a la venta: ");
            System.out.println("2.Consultar informacion de la consecionaria: ");
            System.out.println("3.Consultar vehiculos disponibles: ");
            System.out.println("4.Registrar venta de un vehiculo:  ");
            System.out.println("5.Consultar todos los vehiculos vendidos: ");
            System.out.println("6.Consultar por precio: ");
            System.out.println("7.Capital total de la consecionaria: ");
            System.out.println("8.Ventas totales: ");
            System.out.println("9.Vehiculos disponibles para las ventas: ");
            System.out.println("10.Consultar un vehiculo en particular: ");
            System.out.println("---------------------------------------------------------------------");

            System.out.println("0. Salir");
            System.out.println("Elije una opcion");

            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    if (co.agregarVehiculo(a1) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }
                    if (co.agregarVehiculo(a2) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }
                    if (co.agregarVehiculo(a3) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }
                    if (co.agregarVehiculo(c1) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }
                    if (co.agregarVehiculo(c2) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }
                    if (co.agregarVehiculo(c3) == true) {

                        System.out.println("El vehiculo se añadio con exito!");

                    } else {
                        System.out.println("ERROR: El vehiculo ya fue añadido anteriormente.");
                    }

                    // co.agregarVehiculo(a2);
                    // co.agregarVehiculo(a3);
                    // co.agregarVehiculo(c1);
                    // co.agregarVehiculo(c2);
                    // co.agregarVehiculo(c3);
                    // System.out.println("Vehiculos añadidos exitosamente");
                    break;
                case 2:
                    System.out.println(co.getDatosConsecionaria());

                    break;
                case 3:

                    ArrayList<Vehiculo> lista2 = co.MostrarVehiculosVenta();
                    System.out.println("Los vehiculos disponibles para la venta son los siguientes: ");
                    for (Vehiculo v : lista2) {
                        System.out.println(v);
                    }

                    break;

                case 4:

                    System.out.println("Ingrese el id del vehiculo vendido");
                    int id2 = entrada.nextInt();

                    if (co.RegistrarVenta(id2) == true) {
                        System.out.println("El vehiculo se vendio correctamente");

                    } else {
                        System.out.println("El vehiculo no existe o ya fue vendido!");

                    }

                    break;

                case 5:
                    //System.out.println("Los vehiculos que se vendieron son:");
                    //System.out.println(co.MostrarVehiculosVendidos());
                    ArrayList<Vehiculo> lista3 = co.MostrarVehiculosVendidos();
                    System.out.println("Los vehiculos vendidos son:");
                    for (Vehiculo v : lista3) {
                        System.out.println(v);
                    }

                    break;

                case 6:

                    System.out.println("Ingrese el precio: ");
                    double precio = entrada.nextDouble();

                    ArrayList<Vehiculo> lista = co.VehiculosMenores(precio);
                    System.out.println("Los vehiculos menores a: $" + precio + " son:");
                    for (Vehiculo v : lista) {
                        System.out.println(v);
                    }

                    break;

                case 7:
                    System.out.println("El capital total de la consecionaria es: $" + co.CapitalTotal());

                    break;

                case 8:
                    System.out.println("Ventas totales: $" + co.VentasTotales());

                    break;
                case 9:
                    System.out.println("Cantidad de autos diponibles para la venta: " + co.VehiculosParaVenta());

                    break;

                case 10:

                    System.out.println("Ingrese el id del vehiculo que desea buscar:");
                    int id3 = entrada.nextInt();
                    if (co.ConsultarVehiculo(id3) != null) {
                        System.out.println("Vehiculo: " + co.ConsultarVehiculo(id3));
                    } else {
                        System.out.println("Ingrese un ID existente!");
                    }
                    break;

                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion elegida no es valida.");

            }

        } while (!salir);

        entrada.close();

        System.out.println("Bye");

    }

}
