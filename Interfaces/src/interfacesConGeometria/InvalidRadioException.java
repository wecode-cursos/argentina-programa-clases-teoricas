package interfacesConGeometria;

/***
 * InvalidRadioException se lanza cuando un Círculo reciben un radio igual a 0 o
 * negativo. Lo que imposibilita representar la figura en el plano
 *
 */
@SuppressWarnings("serial")
public class InvalidRadioException extends RuntimeException {

	public InvalidRadioException(String string) {
		super(string);
	}

}
