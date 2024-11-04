package Polimorfismo;

class Camioneta extends Vehiculo {
    private int capacidadPasajeros;

    public Camioneta(String marca, String modelo, int capacidadPasajeros) {
        super(marca, modelo);
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String describir() {
        return tipoVehiculo() + ": " + marca + " " + modelo + ", con capacidad para " + capacidadPasajeros + " pasajeros";
    }

    @Override
    public String tipoVehiculo() {
        return "Camioneta";
    }
}