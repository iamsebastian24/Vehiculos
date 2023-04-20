import java.util.ArrayList;
import java.util.List;

public class EmpresaTransporte {
    private List<Vehiculo> listaVehiculos;

    public EmpresaTransporte() {
        listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(Vehiculo vehiculo) {
        listaVehiculos.add(vehiculo);
    }

    public void mostrarListaVehiculos() {
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Tipo de vehículo: " + vehiculo.getTipoVehiculo());
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println("Precio: " + vehiculo.getPrecio());
            if (vehiculo instanceof Camion) {
                Camion camion = (Camion) vehiculo;
                System.out.println("Capacidad de carga: " + camion.getCapacidadCarga());
            } else if (vehiculo instanceof Furgoneta) {
                Furgoneta furgoneta = (Furgoneta) vehiculo;
                System.out.println("Volumen: " + furgoneta.getVolumen());
            } else if (vehiculo instanceof Auto) {
                Auto auto = (Auto) vehiculo;
                System.out.println("Número de puertas: " + auto.getNumPuertas());
            }
            System.out.println();
        }
    }
}
