package main;

import data.CoffeeLot;
import observers.Barista;
import data.CoffeData;


public class Main {

    public static void main(String[] args) {

        CoffeData cooperativa = new CoffeData();

        Barista barista1 = new Barista(
                "juan Camilo",
                "202210"
        );

        Barista barista2 = new Barista(
                "Laura Alejandra",
                "202211"
        );

        Barista barista3 = new Barista(
                "Andrés Santos",
                "202212"
        );

        cooperativa.registerObserver(barista1);
        cooperativa.registerObserver(barista2);
        cooperativa.registerObserver(barista3);

        CoffeeLot lote1 = new CoffeeLot(
                "Bourbón Rosado",
                "Frutos rojos, moras, cereza, "
                + "caramelo, acidez media alta "
                + "y residual prolongado a cacao",
                "Juan Pérez",
                "Acevedo, Huila",
                1250,
                40
        );


        cooperativa.registerLot(lote1);


        System.out.println("\nEliminando suscripción de Laura...");
        cooperativa.removeObserver(barista2);

        // Crear otro lote
        CoffeeLot lote2 = new CoffeeLot(
                "Geisha",
                "Notas florales, jazmín, miel y "
                + "frutas tropicales",
                "María Rodríguez",
                "Génova, Quindío",
                1900,
                30
        );

        // Registrar el segundo lote
        cooperativa.registerLot(lote2);
    }
}
