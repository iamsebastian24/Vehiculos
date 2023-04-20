public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String marca, String modelo, double precio, double capacidadCarga) {
        super(marca, modelo, precio, "Camión");
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
