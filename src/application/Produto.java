package application;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;
	
	public static final String SEPARATOR = ";";
	
	public Produto () {
	}

	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public void gravarProduto(String nome, double preco, int qtde) {
		
	}
	
	
	public String toString() {
		return this.nome + SEPARATOR + String.format("%.2f",this.preco) + SEPARATOR + this.qtde;			
	}
	
}
