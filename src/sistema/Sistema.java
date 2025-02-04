package sistema;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import caixas.Caixa;
import caixas.Circular;
import caixas.Pentagonal;
import caixas.Retangular;

public class Sistema {

	private Map<String, Caixa> caixasCadastradas;
	private List<String> pesquisa;

	public Sistema() {
		this.caixasCadastradas = new HashMap<>();
	}

	public void cadastraCaixaPentagonal(String descUnica, String personalizacao, int lado) {
		Caixa caixa = new Pentagonal(descUnica, personalizacao, lado);
		this.caixasCadastradas.put(descUnica, caixa);
	}

	public void cadastraCaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		Caixa caixa = new Retangular(descUnica, personalizacao, lado1, lado2);
		this.caixasCadastradas.put(descUnica, caixa);
	}

	public void cadastraCaixaCircular(String descUnica, String personalizacao, int raio) {
		Caixa caixa = new Circular(descUnica, personalizacao, raio);
		this.caixasCadastradas.put(descUnica, caixa);
	}

	public void modificar(String descUnica, String novaPersonalizacao) {
		this.caixasCadastradas.get(descUnica).setPersonalizacao(novaPersonalizacao);
	}

	public boolean remover(String descUnica) {
		if (caixasCadastradas.containsKey(descUnica)) {
			this.caixasCadastradas.remove(descUnica);
			return true;
		}
		return false;
	}

	public boolean contem(String personalizacao, String formato) {
		for (Caixa caixa : caixasCadastradas.values()) {
			if (caixa.getPersonalizacao().equalsIgnoreCase(personalizacao)
					&& caixa.getFormato().equalsIgnoreCase(formato))
				return true;
		}
		return false;
	}

	public int calcularRendimentos() {
		int rendimentosTotal = 0;
		for (Caixa caixa : caixasCadastradas.values()) {
			rendimentosTotal += caixa.precoTotal();
		}
		return rendimentosTotal;
	}

	public String pesquisa(String personalizacao) {
		this.pesquisa = new ArrayList<>();
		for (Caixa caixa : caixasCadastradas.values()) {
			if (caixa.getPersonalizacao().equalsIgnoreCase(personalizacao)) {
				pesquisa.add(caixa.getDescUnica());
			}
		}
		Collections.sort(pesquisa);
		return pesquisa.toString();
	}

}
