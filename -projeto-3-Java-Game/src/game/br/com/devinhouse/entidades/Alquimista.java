package game.br.com.devinhouse.entidades;

public class Alquimista extends Guerreiro {
	
	private final int vida = 100;
	private final int ataque = 6;
	private final int defesa = 5;
	
	public Alquimista(String nome, String sexo) {
		super(nome, sexo);
		
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
	}
}
