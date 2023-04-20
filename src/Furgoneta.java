public class Furgoneta extends Vehiculo {
    private double volumen;

    public Furgoneta(String marca, String modelo, double precio, double volumen) {
        super(marca, modelo, precio, "Furgoneta");
        this.volumen = volumen;
    }

    public double getVolumen() {
        return volumen;
    }
}
