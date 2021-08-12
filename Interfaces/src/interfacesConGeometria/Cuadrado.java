package interfacesConGeometria;

public class Cuadrado extends Figura {
	
		private double lado;

	   	public Cuadrado(Punto inferiorIzquierdo, double lado) throws InvalidCuadradoException{
			super(inferiorIzquierdo);
			setLado(lado);
		}

	   	private void setLado(double lado) {
			if (lado <= 0)
				throw new InvalidCuadradoException("Lado negativo o cero");
			this.lado = lado;
		}
	   	   	   	
		@Override
		public Double getArea() {
			return lado * lado;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			long temp;
			temp = Double.doubleToLongBits(lado);
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
			Cuadrado other = (Cuadrado) obj;
			if (Double.doubleToLongBits(lado) != Double.doubleToLongBits(other.lado))
				return false;
			return true;
		}

}
