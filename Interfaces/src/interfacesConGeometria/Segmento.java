package interfacesConGeometria;

public class Segmento implements Comparable<Segmento>, Desplazable, EsParalelo {

	private Punto puntoA;
	private Punto puntoB;

	public Segmento(Punto puntoA, Punto puntoB) throws InvalidSegmentoException{
		if(puntoA.equals(puntoB))
			throw new InvalidSegmentoException("Los extremos no pueden ser el mismo punto");
		else{
			this.puntoA = puntoA;
			this.puntoB = puntoB;
			}
	}

	public Double getLargo() {
		return this.puntoA.distancia(puntoB);
	}

	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.puntoA.desplazar(deltaX, deltaY);
		this.puntoB.desplazar(deltaX, deltaY);

	}

	@Override
	public int compareTo(Segmento o) {
		return this.getLargo().compareTo(o.getLargo());
	}

	@Override
	public boolean esParaleloAX() {
		return this.puntoA.getY() == this.puntoB.getY();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((puntoA == null) ? 0 : puntoA.hashCode());
		result = prime * result + ((puntoB == null) ? 0 : puntoB.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Segmento other = (Segmento) obj;
		if (puntoA == null) {
			if (other.puntoA != null)
				return false;
		} else if (!puntoA.equals(other.puntoA))
			return false;
		if (puntoB == null) {
			if (other.puntoB != null)
				return false;
		} else if (!puntoB.equals(other.puntoB))
			return false;
		return true;
	}

	@Override
	public boolean esParaleloAY() {
		return this.puntoA.getX() == this.puntoB.getX();
	}

	@Override
	public boolean esParalelo(EsParalelo s) {
		if (s instanceof Segmento) {
			Segmento otro = (Segmento) s;

			double a = this.puntoB.getY() - this.puntoA.getY();
			double b = this.puntoB.getX() - this.puntoA.getX();
			double c = otro.puntoB.getY() - otro.puntoA.getY();
			double d = otro.puntoB.getX() - otro.puntoA.getX();
			return (a / b == c / d);

		}
		return false;
	}

}
