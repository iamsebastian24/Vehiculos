public class Vehiculo {
    private String marca;
    private String modelo;
    private double precio;
    private String tipoVehiculo;

    public Vehiculo(String marca, String modelo, double precio, String tipoVehiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }
}
