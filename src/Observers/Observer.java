package observers;
import subject.Subject;

public interface Observer {

	public void update(String Variety, String TasttingNotes, String NameProductor, String Origin, int Hight, int AvailableCuantity);
}