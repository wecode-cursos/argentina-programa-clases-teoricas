package interfacesConGeometria;

/***
 * InvalidSegmentoException se lanza cuando los extremos del segmento 
 * son el mismo punto, en ese caso no es un segmento e intentar verificar que 
 * dos segmentos sean paralelos provocaría una división por cero. 
 *
 */

@SuppressWarnings("serial")
public class InvalidSegmentoException extends RuntimeException {

	public InvalidSegmentoException(String s) {
		super(s);
	}

}
