package getPersonas;
import java.util.Comparator;

public class EdadComparator implements Comparator<Persona>{
	
	@Override
	public int compare(Persona o1, Persona o2) {
		return Integer.compare(o1.getEdad(), o2.getEdad());
	}
}
