package caixas;

public abstract class Caixa implements Formato{
	
	protected String descUnica;
	protected String personalizacao;
	protected String formato;
	protected int preco;

	public Caixa(String descUnica, String personalizacao) {
		this.descUnica = descUnica;
		this.personalizacao = personalizacao;
		this.preco = (int) precoTotal(); //rever
	}

	public String getDescUnica() {
		return descUnica;
	}
	
	

	public void setDescUnica(String descUnica) {
		this.descUnica = descUnica;
	}

	public String getPersonalizacao() {
		return personalizacao;
	}

	public void setPersonalizacao(String personalizacao) {
		this.personalizacao = personalizacao;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	@Override
	public String toString() {
		return "Caixa com <" + this.personalizacao +"> custa <" + this.preco + "> centavos. Formato <" + this.formato + ">.";
	}

}
