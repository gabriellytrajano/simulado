package sistema;

public class Facade {
	
	private Sistema sistema;
	
	public Facade() {
		this.sistema = new Sistema();
	}
	
	public void cadastraCaixaPentagonal(String descUnica, String personalizacao, int lado) {
		this.sistema.cadastraCaixaPentagonal(descUnica, personalizacao, lado);
	}
	
	public void cadastraCaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		this.sistema.cadastraCaixaRetangular(descUnica, personalizacao, lado1, lado2);
	}
	
	public void cadastraCaixaCircular(String descUnica, String personalizacao, int raio) {
		this.sistema.cadastraCaixaCircular(descUnica, personalizacao, raio);
	}
	
	public void modificar(String descUnica, String novaPersonalizacao) {
		this.sistema.modificar(descUnica, novaPersonalizacao);
	}
	
	public boolean remover(String descUnica) {
		return this.sistema.remover(descUnica);
	}
	
	public boolean contem(String personalizacao, String formato) {
		return this.sistema.contem(personalizacao, formato);
	}
	
	public int calcularRendimentos() {
		return this.sistema.calcularRendimentos();
	}
	
	public String pesquisa(String personalizacao) {
		return this.sistema.pesquisa(personalizacao);
	}
}
