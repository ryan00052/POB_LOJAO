package loja;

public class ItensCarrinho {
    private int id;
    private int idCarrinho;
    private String upc;
    private double valor;
    private int qtde;

    public ItensCarrinho(int id, int idCarrinho, String upc, double valor, int qtde) {
        this.id = id;
        this.idCarrinho = idCarrinho;
        this.upc = upc;
        this.valor = valor;
        this.qtde = qtde;
    }

	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCarrinho() {
        return idCarrinho;
    }

    public void setIdCarrinho(Carrinho carrinho) {
        this.idCarrinho = carrinho.getId();
    }
    
    public String getUpc() {
		return upc;
	}

	public double getValor() {
		return valor;
	}

	public void setAtributosDoProduto(Produto produto) {
        this.upc = produto.getUpc();
        this.valor = produto.getValor();
    }
    
    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
