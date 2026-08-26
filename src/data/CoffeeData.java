package data;
import subjects.Subject;

public class CoffeData implements Subject{
    private List<Observer> observers = new ArrayList<Observer>();

    public void registerObserver(Observer o) {
		System.out.println("Suscribete para recibir notificaciones");
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		System.out.println("Desuscribete si ya no quieres recibir información");
		observers.remove(o);
	}

	public void notifyObservers() {
		System.out.println("\n   Hay una nueva notificación del clima  ");
		for (Observer observer : observers) {
			System.out.print("  ");
			observer.update(temperature, humidity, pressure);
		}
	}
    
}