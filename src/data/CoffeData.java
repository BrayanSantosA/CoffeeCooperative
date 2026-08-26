package data;
import subject.Subject;
import observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class CoffeData implements Subject{

    private List<Observer> observers = new ArrayList<Observer>();
	private String variety;
	private String tastingNotes;
	private String nameProducer;
	private String origin;
	private int height;
	private int availableQuantity;

    public void registerObserver(Observer o) {
		System.out.println("Suscribete para recibir notificaciones");
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		System.out.println("Desuscribete si ya no quieres recibir información");
		observers.remove(o);
	}

	public void notifyObservers() {
		System.out.println("\n   Hay una nueva notificación de un lote de cafe");
		for (Observer observer : observers) {
			System.out.print("  ");
			observer.update(variety, tastingNotes, nameProducer, origin, height, availableQuantity);
		}
	}

	

}