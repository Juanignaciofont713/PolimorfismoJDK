package Polimorfismo;

class Camion extends Vehiculo {
    private int capacidadCarga;

    public Camion(String marca, String modelo, int capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String describir() {
        return tipoVehiculo() + ": " + marca + " " + modelo + ", con capacidad de " + capacidadCarga + " toneladas";
    }

    @Override
    public String tipoVehiculo() {
        return "Camion";
    }
}