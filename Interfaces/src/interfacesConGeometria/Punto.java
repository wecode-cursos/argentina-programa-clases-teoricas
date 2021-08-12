package interfacesConGeometria;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Punto implements Desplazable {
	
	private double x;
	private double y;
	
	
	public double getX() {
		return x;
	}
	private void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	private void setY(double y) {
		this.y = y;
	}
	
	public Punto(double x, double y) {
		this.setX(x);
		this.setY(y);
	}
	
	public double distancia(Punto otro) {

		return sqrt(pow(this.x - otro.x, 2) + pow(this.y - otro.y, 2));
	}
	
	@Override
	public void desplazar(double deltaX, double deltaY) {
		this.setX(this.getX()+deltaX);
		this.setY(this.getY()+deltaY);
	}
	@Override
	public String toString() {
		return "[" + x + "," + y + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
		
}
