public class Auto extends Vehiculo {
    private int numPuertas;

    public Auto(String marca, String modelo, double precio, int numPuertas) {
        super(marca, modelo, precio, "Auto");
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }
}

