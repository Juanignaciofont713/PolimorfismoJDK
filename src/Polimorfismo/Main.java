package Polimorfismo;

public class Main {
    public static void mostrarDescripciones(Vehiculo[] vehiculos) {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo.describir());
        }
    }

    public static void main(String[] args) {
        Vehiculo[] vehiculos = {
            
                // Autos
                new Auto("Toyota", "Corolla", 4),
                new Auto("Honda", "Civic", 4),
                new Auto("Ford", "Mustang", 2),
                new Auto("Chevrolet", "Camaro", 2),
                new Auto("Nissan", "Altima", 4),
                new Auto("Mazda", "3", 4),
                new Auto("Hyundai", "Elantra", 4),
                new Auto("Volkswagen", "Jetta", 4),
                new Auto("BMW", "Serie 3", 4),
                new Auto("Audi", "A4", 4),
                new Auto("Mercedes-Benz", "Clase C", 4),
                new Auto("Kia", "Optima", 4),
                new Auto("Subaru", "Impreza", 4),
                new Auto("Tesla", "Model S", 4),
                new Auto("Volvo", "S60", 4),

                // Motocicletas
                new Motocicleta("Yamaha", "MT-07", 689),
                new Motocicleta("Honda", "CBR600RR", 600),
                new Motocicleta("Ducati", "Panigale V4", 1103),
                new Motocicleta("Kawasaki", "Ninja H2", 998),
                new Motocicleta("BMW", "S1000RR", 999),
                new Motocicleta("Suzuki", "GSX-R750", 750),
                new Motocicleta("Harley-Davidson", "Iron 883", 883),
                new Motocicleta("Triumph", "Street Triple", 765),
                new Motocicleta("KTM", "Duke 390", 373),
                new Motocicleta("Royal Enfield", "Interceptor 650", 648),
                new Motocicleta("Aprilia", "RSV4", 1100),
                new Motocicleta("MV Agusta", "F4", 998),
                new Motocicleta("Indian", "FTR 1200", 1203),
                new Motocicleta("Benelli", "TNT 600", 600),
                new Motocicleta("Husqvarna", "Svartpilen 401", 373),

                // Camiones
                new Camion("Volvo", "FH", 25),
                new Camion("Mercedes-Benz", "Actros", 30),
                new Camion("Scania", "R500", 40),
                new Camion("MAN", "TGX", 35),
                new Camion("Freightliner", "Cascadia", 28),
                new Camion("Kenworth", "W900", 33),
                new Camion("Peterbilt", "579", 27),
                new Camion("International", "LT", 29),
                new Camion("Mack", "Anthem", 32),
                new Camion("Iveco", "Stralis", 26),
                new Camion("DAF", "XF", 31),
                new Camion("Renault", "T Range", 34),
                new Camion("Isuzu", "Giga", 20),
                new Camion("Hino", "700", 24),
                new Camion("Foton", "Auman", 22),

                // Camionetas
                new Camioneta("Ford", "Ranger", 5),
                new Camioneta("Toyota", "Hilux", 5),
                new Camioneta("Chevrolet", "S10", 5),
                new Camioneta("Nissan", "Frontier", 5),
                new Camioneta("Mitsubishi", "L200", 5),
                new Camioneta("Volkswagen", "Amarok", 5),
                new Camioneta("RAM", "1500", 5),
                new Camioneta("Honda", "Ridgeline", 5),
                new Camioneta("GMC", "Canyon", 5),
                new Camioneta("Jeep", "Gladiator", 5),
                new Camioneta("Mazda", "BT-50", 5),
                new Camioneta("SsangYong", "Musso", 5),
                new Camioneta("Great Wall", "Poer", 5),
                new Camioneta("JAC", "T8", 5),
                new Camioneta("Fiat", "Toro", 5)
       
        };

        mostrarDescripciones(vehiculos);
    }
}