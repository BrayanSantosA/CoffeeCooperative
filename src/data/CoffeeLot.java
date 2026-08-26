package data;

public class CoffeeLot{

    private String variety;
    private String tastingNotes;
    private String producerName;
    private String origin;
    private int height;
    private int availableQuantity;

    public CoffeeLot(String variety, String tastingNotes,
                     String producerName, String origin,
                     int height, int availableQuantity) {

        this.variety = variety;
        this.tastingNotes = tastingNotes;
        this.producerName = producerName;
        this.origin = origin;
        this.height = height;
        this.availableQuantity = availableQuantity;
    }

    public String getVariety() {
        return variety;
    }

    public String getTastingNotes() {
        return tastingNotes;
    }

    public String getProducerName() {
        return producerName;
    }

    public String getOrigin() {
        return origin;
    }

    public int getHeight() {
        return height;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }
}


