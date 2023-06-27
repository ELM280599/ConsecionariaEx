package consecionaria;

public class Vehiculo {

    int id = 0;
    String patente;
    int modelo = 0;
    double costo = 0;
    double precioVenta = 0;
    String estado;
    String nombre;

    public Vehiculo(int pid, String Ppatente, String pnombre, int pmodelo, double pcosto, double PprecioVenta, String pestado) {
        this.costo = pcosto;
        this.estado = pestado;
        this.id = pid;
        this.modelo = pmodelo;
        this.nombre = pnombre;
        this.patente = Ppatente;
        this.precioVenta = PprecioVenta;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id= " + id + ", patente= " + patente + ", modelo= " + modelo + ", costo= $" + costo + ", precio de venta= $" + precioVenta + ", estado= " + estado + ", nombre= " + nombre + '}';
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
