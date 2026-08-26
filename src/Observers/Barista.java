package observers;
import data.CoffeeLot;

public class Barista implements Observer {

    private String name;
    private String identification;

    public Barista(String name, String identification) {
        this.name = name;
        this.identification = identification;
    }

    @Override
    public void update(CoffeeLot coffeeLot) {

        System.out.println("\nNotificación para: " + name);
        System.out.println("Varietal: " + coffeeLot.getVariety());
        System.out.println("Notas de cata: "
                + coffeeLot.getTastingNotes());
        System.out.println("Productor: "
                + coffeeLot.getProducerName());
        System.out.println("Origen: "
                + coffeeLot.getOrigin());
        System.out.println("Altura: "
                + coffeeLot.getHeight() + " msnm");
        System.out.println("Cantidad disponible: "
                + coffeeLot.getAvailableQuantity() + " libras");
        System.out.println("--------------------------------");
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }
}

