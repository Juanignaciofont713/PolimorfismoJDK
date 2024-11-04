package Polimorfismo;

abstract class Vehiculo {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract String describir();

    public String tipoVehiculo() {
        return "Vehículo";
    }
}