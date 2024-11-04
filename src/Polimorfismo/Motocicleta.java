package Polimorfismo;

class Motocicleta extends Vehiculo {
    private int cilindrada;

    public Motocicleta(String marca, String modelo, int cilindrada) {
        super(marca, modelo);
        this.cilindrada = cilindrada;
    }

    @Override
    public String describir() {
        return tipoVehiculo() + ": " + marca + " " + modelo + ", con " + cilindrada + "cc de cilindrada";
    }

    @Override
    public String tipoVehiculo() {
        return "Motocicleta";
    }
}