package data;
import subject.Subject;
import observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class CoffeData implements Subject{

private List<Observer> observers;
    private CoffeeLot coffeeLot;

    public CoffeData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);

        System.out.println("Barista suscrito correctamente.");
    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);

        System.out.println("Barista eliminado de la suscripción.");
    }

    @Override
    public void notifyObservers() {

        System.out.println(
            "\nHay una nueva notificación de un lote de café."
        );

        for (Observer observer : observers) {
            observer.update(coffeeLot);
        }
    }

    public void registerLot(CoffeeLot coffeeLot) {

        this.coffeeLot = coffeeLot;

        System.out.println("\nNuevo lote registrado:");
        System.out.println("Varietal: " + coffeeLot.getVariety());
        System.out.println("Productor: "
                + coffeeLot.getProducerName());
        System.out.println("Cantidad: "
                + coffeeLot.getAvailableQuantity()
                + " libras");

        notifyObservers();
    }


}