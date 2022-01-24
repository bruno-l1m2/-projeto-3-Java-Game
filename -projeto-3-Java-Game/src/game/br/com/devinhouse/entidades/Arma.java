package game.br.com.devinhouse.entidades;

public class Arma {
	
	private String nome;
	private String municao;
	private int ataque;	
	
	public Arma() {
	}
	
	public Arma(String nome, int ataque) {
		this.nome = nome;
		this.ataque = ataque;
	}
	
	public Arma(String nome, int ataque, String municao) {
		this.nome = nome;
		this.ataque = ataque;
		this.municao = municao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	public String getMunicao() {
		return municao;
	}

	public void setMunicao(String municao) {
		this.municao = municao;
	}
	
	
	
	
}
