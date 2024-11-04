package Polimorfismo;

class Auto extends Vehiculo {
    private int puertas;

    public Auto(String marca, String modelo, int puertas) {
        super(marca, modelo);
        this.puertas = puertas;
    }

    @Override
    public String describir() {
        return tipoVehiculo() + ": " + marca + " " + modelo + ", con " + puertas + " puertas";
    }

    @Override
    public String tipoVehiculo() {
        return "Automovil";
    }
}