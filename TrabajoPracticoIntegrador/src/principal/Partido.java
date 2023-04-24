package principal;

public class Partido {
	public Partido () {
		
	}
	
	Equipo local, visitante;
	int golesLocal, golesVisita;
	Resultado resultado;
	
	public Equipo getLocal() {
		return local;
	}
	public void setLocal(Equipo local) {
		this.local = local;
	}
	public Equipo getVisitante() {
		return visitante;
	}
	public void setVisitante(Equipo visitante) {
		this.visitante = visitante;
	}
	public int getGolesLocal() {
		return golesLocal;
	}
	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}
	public int getGolesVisita() {
		return golesVisita;
	}
	public void setGolesVisita(int golesVisita) {
		this.golesVisita = golesVisita;
	}
	
	public Enum Result (Equipo resultado_equipo) {
		if (golesLocal==golesVisita) {
			resultado = Resultado.EMPATADO;
		}else if (golesLocal>golesVisita) {
			resultado = Resultado.GANADOR;
		}else if (golesLocal<golesVisita);{
			resultado = Resultado.PERDEDOR;
		}
		return resultado;
	}

}
