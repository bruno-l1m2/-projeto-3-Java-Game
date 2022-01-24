package game.br.com.devinhouse.entidades;

public class Besta extends Arma {
	private final int ataquearma = 13;
	private final String nomearma = "Besta";
	private final String municaoarma = "Virote";
	
	public Besta() {
	}
	
	public Besta(String nome, int ataque, String municao) {
		super(nome, ataque, municao);
		this.setNome(nomearma);
		this.setAtaque(ataquearma);
		this.setMunicao(municaoarma);
    }  
}