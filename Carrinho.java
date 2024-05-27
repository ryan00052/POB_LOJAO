package loja;

public class Carrinho {
	int id;
	double pesoTotal;

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(Produto produto, ItensCarrinho Quant) {
		this.pesoTotal = produto.getPeso() * Quant.getQtde();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
