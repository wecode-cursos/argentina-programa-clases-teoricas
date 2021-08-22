/***
 * InvalidRadioException se lanza cuando un Círculo reciben un radio igual a 0 o
 * negativo. Lo que imposibilita representar la figura en el plano
 *
 */
@SuppressWarnings("serial")
public class RadioNegativoException extends RuntimeException {

	public RadioNegativoException(String string) {
		super(string);
	}

}
