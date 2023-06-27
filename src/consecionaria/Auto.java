package consecionaria;

public class Auto extends Vehiculo {

    int puertas = 0;
    String color;

    public Auto(int pid, String Ppatente, String pnombre, int pmodelo, double pcosto, double PprecioVenta, String pestado, int ppuertas, String pcolor) {
        super(pid, Ppatente, pnombre, pmodelo, pcosto, PprecioVenta, pestado);
        this.puertas = ppuertas;
        this.color = pcolor;

        //Getters and Setters
    }
    // @Override
    // public String toString() {
    //    String pVehiculo = super.toString();
    //    String pAuto = ", El color es: " + color + ",Tiene " + puertas + " puertas.";

    //    return pVehiculo + pAuto;
    // }
    @Override
    public String toString() {
        return "Auto: " + "id= " + id + ", patente= " + patente + ", modelo= " + modelo + ", costo= $" + costo + ", precio de venta= $" + precioVenta + ", estado= " + estado + ", nombre= " + nombre + ", la cantidad de puertas es: " + puertas + ", el color es: " + color + "\n";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
