package game.br.com.devinhouse.entidades;

public class Arco extends Arma {
	private final int ataquearma = 13;
	private final String nomearma = "Arco";
	private final String municaoarma = "Flecha";
	
	
	public Arco() {
	}
	
	public Arco(String nome, int ataque, String municao) {
		super(nome, ataque, municao);
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
		this.setMunicao(municaoarma);
	}
}
