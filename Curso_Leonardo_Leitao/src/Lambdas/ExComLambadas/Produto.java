package Lambdas.ExComLambadas;

public class Produto {
	
	String produto;
	double preco;
	double desc;
	public Produto(String produto, double preco, double desc) {
		super();
		this.produto = produto;
		this.preco = preco;
		this.desc = desc;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getDesc() {
		return desc;
	}
	public void setDesc(double desc) {
		this.desc = desc;
	}

}
