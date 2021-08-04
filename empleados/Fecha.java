package empleados;

import java.util.Objects;

public class Fecha {

	int dia;
	int mes;
	int anio;

	public Fecha(int dia, int mes, int anio) {
		if (!fechaValida(dia, mes, anio))
			throw new Error("Fecha inválida");

		this.dia = dia;
		this.mes = mes;
		this.anio = anio;

	}

	@Override
	public int hashCode() {
		return Objects.hash(anio, dia, mes);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fecha other = (Fecha) obj;
		return anio == other.anio && dia == other.dia && mes == other.mes;
	}

	private boolean fechaValida(int dia, int mes, int anio) {

		return (mes >= 1 && mes <= 12) && (anio >= 1900 && anio <= 2050) && (dia >= 1 && dia <= diasDelMes(mes, anio));

	}

	private int diasDelMes(int mes, int anio) {
		int dias = -1;
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11)
			dias = 30;
		else {
			if (mes == 2)
				return 28 + anioBisiesto(anio);
			else
				dias = 31;
		}

		return dias;
	}

	private int anioBisiesto(int anio) {
		if ((anio / 4 == 0 && anio / 100 != 0) || anio / 400 == 0)
			return 1;
		return 0;
	}

}
