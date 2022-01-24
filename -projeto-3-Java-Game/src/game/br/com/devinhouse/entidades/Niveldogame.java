package game.br.com.devinhouse.entidades;

public class Niveldogame {
	private int nivel;
	
	public Niveldogame(String nivel) {
		if(nivel == "Fácil") {
			this.nivel = 20;
		} else if(nivel == "Normal") {
			this.nivel = 0;
		} else if (nivel == "Difícil") {
			this.nivel = 10;
		}
	}
	
	public int getNivel() {
		return nivel;
	}
	
	public void setNivel(int nivel) {
		this.nivel=nivel;
	}
	
}





