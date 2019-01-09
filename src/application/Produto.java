package application;

public class Produto {
	private String nome;
	private double preco;
	private int qtde;
	
	public Produto () {
	}

	public Produto(String nome, double preco, int qtde) {
		this.nome = nome;
		this.preco = preco;
		this.qtde = qtde;
	}
	
	public void gravarProduto(String nome, double preco, int qtde) {
		
	}
	
	public void gerarTotais() {
			
	}
	
	public String toString() {
		return this.nome + "," + String.format("%.2f",this.preco) + "," + this.qtde;			
	}
	
}
