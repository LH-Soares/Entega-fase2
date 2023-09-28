package model;


public class Vacinacao {
	
	private int id;
	private float doses;
	private String vacinas;
	
	public Vacinacao() {
		
	}
	
	public Vacinacao(int id, float doses, String vacinas) {
		
		this.id = id;
		this.doses = doses;
		this.vacinas = vacinas;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getDoses() {
		return doses;
	}

	public void setDoses(float doses) {
		this.doses = doses;
	}

	public String getVacinas() {
		return vacinas;
	}

	public void setVacinas(String vacinas) {
		this.vacinas = vacinas;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", doses=" + doses + ", vacinas=" + vacinas + "]";
	}
	
	

}