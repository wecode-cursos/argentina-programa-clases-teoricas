package interfacesConGeometria;

public class Circulo extends Figura {
	
	private double radio;

	public Circulo(Punto centro, double radio) throws InvalidRadioException {
		super(centro);
		setRadio(radio);
	}

	private void setRadio(double radio) {
		if (radio <= 0)
			throw new InvalidRadioException("Radio negativo o cero");
		this.radio = radio;
	}

	public double getRadio() {
		return this.radio;
	}

	public double getDiametro() {
		return this.radio * 2;
	}

	public double getPerimetro() {
		return Math.PI * this.getDiametro();
	}

	@Override
	public Double getArea() {
		return Math.PI * Math.pow(this.radio, 2);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		long temp;
		temp = Double.doubleToLongBits(radio);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circulo other = (Circulo) obj;
		if (Double.doubleToLongBits(radio) != Double.doubleToLongBits(other.radio))
			return false;
		return true;
	}

	

	
}