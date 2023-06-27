package consecionaria;

import java.util.ArrayList;

public class Consecionaria {

    String nombre;
    String direccion;
    int cuit;

    public Consecionaria(String pnombre, String pdireccion, int pcuit) {
        this.nombre = pnombre;
        this.direccion = pdireccion;
        this.cuit = pcuit;

    }

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }
    //Consecionaria() {
    //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    double TotalVentas = 0;
    double CapitalTotal = 0;

    ArrayList<Vehiculo> listadoVehiculos = new ArrayList<Vehiculo>();

    //Metodo 1 agrego los vehiculos al arraylist  y valido que el id no exista reutilizanodo el metodo 10
    // y retorno la variable guardado que va a devolver true en el caso de que se haya podido añadir el vehiculo
    public boolean agregarVehiculo(Vehiculo Vi) {

        Vehiculo aux = ConsultarVehiculo(Vi.getId()); // RETUTILIZO EL METODO YA PROGRAMADO
        boolean guardado = false;

        if (aux == null) {
            listadoVehiculos.add(Vi);
            guardado = true;
        }

        return guardado;

    }

    //Metodo 2 Muestro los datos de la consecionaria a traves de la variable Datos
    public String getDatosConsecionaria() {
        String Datos = " La consecionaria es: " + getNombre() + ",  direccion: " + getDireccion() + ", capital total: $" + CapitalTotal();

        return Datos;

    }

    //Metodo 3 Recorro el arraylist con los vehiculos y si en el "estado" del mismo dice "En venta" se añade a un array auxiliar 
    //el cual al final es retornado por el metodo
    public ArrayList<Vehiculo> MostrarVehiculosVenta() {
        ArrayList<Vehiculo> aux1;
        aux1 = new ArrayList<Vehiculo>();

        for (Vehiculo v : listadoVehiculos) {
            if (v.estado.toUpperCase().equals("EN VENTA") && v instanceof Vehiculo) {

                aux1.add(v);

            }

        }
        return aux1;

    }

    //Metodo 4 recibe un id ingresado por el usuario el cual luego de recorrer el arraylist es comparado con el id de los vehiculos
    //Si coincide se le cambia el estado del vehiculo a "vendido" y se acumulan las ventas dentro de la variable TotalVentas
    //Retorno true o false de acuerdo a si se pudo realizar la venta o no
    public boolean RegistrarVenta(int id2) {

        for (Vehiculo v : listadoVehiculos) {
            if (id2 == v.getId()) {
                if (v.estado.toUpperCase().equals("EN VENTA")) {

                    v.setEstado("Vendido");
                    TotalVentas = TotalVentas + v.getPrecioVenta();
                    return true;

                }
            }
        }
        return false;

    }

    //Metodo 5 recorro el array y muestro todos los autos que tengan en su estado "VENDIDO" con sus datos
    //guardo los vehiculos dentro de un arraylist auxiliar para luego retornarlos 
    public ArrayList MostrarVehiculosVendidos() {
        ArrayList<Vehiculo> aux;
        aux = new ArrayList<Vehiculo>();
        for (Vehiculo v : listadoVehiculos) {
            if (v.estado.toUpperCase().equals("VENDIDO") && v instanceof Vehiculo) {
                aux.add(v);

            }

        }

        return aux;

    }

    //Metodo 6 recorro el array y comparo el valor ingresado con el de los autos disponibles y los guardo dentro de un array
    //que al final del metodo es retornado
    public ArrayList<Vehiculo> VehiculosMenores(double precio) {
        ArrayList<Vehiculo> aux;
        aux = new ArrayList<Vehiculo>();

        for (Vehiculo v : listadoVehiculos) {
            if (v.getPrecioVenta() < precio) {
                aux.add(v);
            }

        }

        return aux;
    }

    //Metodo 7 declaro una variable total donde voy a guardar el valor de los autos que estan a la venta 
    public double CapitalTotal() {
        double total = 0;

        for (Vehiculo v : listadoVehiculos) {
            if (v.estado.toUpperCase().equals("EN VENTA") && v instanceof Vehiculo) {

                total = total + v.getPrecioVenta();

            }

        }
        return total;

    }

    //Metodo 8 Muestro la variable del metodo 4, que ya tiene las ventas acumuladas
    public double VentasTotales() {
        return TotalVentas;

    }

    //Metodo 9 Declaro un contador, luego recorro el array y dentro del if declaro que si el auto tiene estado "En venta"
    //el contador sume +1 y luego retorno el contador
    public int VehiculosParaVenta() {
        int contadorDisponibles = 0;
        for (Vehiculo v : listadoVehiculos) {
            if (v.estado.toUpperCase().equals("EN VENTA")) {
                contadorDisponibles = contadorDisponibles + 1;

            }

        }
        return contadorDisponibles;

    }

    //Metodo 10 el usuario ingresa el id del vehiculo a consultar, luego se compara el id ingresado con los id existentes para verificar
    //que sea valido, si es valido se retorna el vehiculo, sino se retorna null
    public Vehiculo ConsultarVehiculo(int id3) {

        for (Vehiculo v : listadoVehiculos) {

            if (id3 == v.getId()) {

                return v;

            }

        }
        return null;

    }

}
