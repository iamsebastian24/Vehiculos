public class Main {
    public static void main(String[] args) {

        EmpresaTransporte empresaTransporte = new EmpresaTransporte();
        Camion camion1 = new Camion("Mercedez Benz","2009",800000,2355);
        Furgoneta furgoneta1 = new Furgoneta("Volvo","Shagui",34554,2324);
        Auto auto1 = new Auto("Mazda 3","2023",12000,4);
        empresaTransporte.agregarVehiculo(camion1);
        empresaTransporte.agregarVehiculo(furgoneta1);
        empresaTransporte.agregarVehiculo(auto1);
        empresaTransporte.mostrarListaVehiculos();
    }
}