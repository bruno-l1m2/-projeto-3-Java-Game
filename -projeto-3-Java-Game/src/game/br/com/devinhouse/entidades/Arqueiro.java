package game.br.com.devinhouse.entidades;

public class Arqueiro extends Guerreiro{
	
	private final int vida = 100;
	private final int ataque = 9;
	private final int defesa = 7;
	
	public Arqueiro(String nome, String sexo) {
		super(nome, sexo);
		
		this.setVida(vida);
		this.setAtaque(ataque);
		this.setDefesa(defesa);
		
	}


}
