package model;


public class Produto {
	
	private int id;
	private String descrricao;
	private float preco;
	
	public Produto() {
		
	}
	
	public Produto(int id, String descrricao, float preco) {
		this.id = id;
		this.descrricao = descrricao;
		this.preco = preco;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescrricao() {
		return descrricao;
	}

	public void setDescrricao(String descrricao) {
		this.descrricao = descrricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descrricao=" + descrricao + ", preco=" + preco + "]";
	}
	
	
	

}