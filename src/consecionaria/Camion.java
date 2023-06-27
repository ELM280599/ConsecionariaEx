package consecionaria;

public class Camion extends Vehiculo {

    int CantidadRuedas = 0;
    int CapacidadDeCarga = 0;

    public Camion(int pid, String Ppatente, String pnombre, int pmodelo, double pcosto, double PprecioVenta, String pestado, int pCantidadRuedas, int pCapacidadDeCarga) {
        super(pid, Ppatente, pnombre, pmodelo, pcosto, PprecioVenta, pestado);

        this.CantidadRuedas = pCantidadRuedas;
        this.CapacidadDeCarga = pCapacidadDeCarga;

    }
    //Getters and Setters

    @Override
    public String toString() {
        return "Camion: " + "id= " + id + ", patente= " + patente + ", modelo= " + modelo + ", costo= $" + costo + ", precio de venta= $" + precioVenta + ", estado= " + estado + ", nombre= " + nombre + ", la cantidad de ruedas es: " + CantidadRuedas + ", la capacidad de carga es: " + CapacidadDeCarga + "kg" + "\n";
    }

    public int getCapacidadDeCarga() {
        return CapacidadDeCarga;
    }

    public void setCapacidadDeCarga(int CapacidadDeCarga) {
        this.CapacidadDeCarga = CapacidadDeCarga;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadRuedas() {
        return CantidadRuedas;
    }

    public void setCantidadRuedas(int CantidadRuedas) {
        this.CantidadRuedas = CantidadRuedas;
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

    public String isEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
