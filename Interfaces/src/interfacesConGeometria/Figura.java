package interfacesConGeometria;

public abstract class Figura implements Desplazable, Comparable<Figura>{
	
	private Punto punto;
	
	public Figura(Punto punto) {
		this.punto = punto;
	}
	
	public abstract Double getArea();
	
	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.punto.desplazar(deltaX, deltaY);

	}
	
	public int compareTo(Figura f) {
		return this.getArea().compareTo(f.getArea());
	
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((punto == null) ? 0 : punto.hashCode());
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
		Figura other = (Figura) obj;
		if (punto == null) {
			if (other.punto != null)
				return false;
		} else if (!punto.equals(other.punto))
			return false;
		return true;
	}
	
	
	
}
