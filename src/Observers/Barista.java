package observers;

public class Barista implements Observer {

    private String name;
    private String identification;

    public Barista(String name, String identification) {
        this.name = name;
        this.identification = identification;
    }

    @Override
    public void update(String variety, String tastingNotes,
                       String nameProducer, String origin,
                       int height, int availableQuantity) {

        System.out.println("Notificación para: " + name);
        System.out.println("Varietal: " + variety);
        System.out.println("Notas de cata: " + tastingNotes);
        System.out.println("Productor: " + nameProducer);
        System.out.println("Origen: " + origin);
        System.out.println("Altura: " + height + " msnm");
        System.out.println("Cantidad disponible: "
                           + availableQuantity + " libras");
    }

    public String getName() {
        return name;
    }

    public String getIdentification() {
        return identification;
    }
}

