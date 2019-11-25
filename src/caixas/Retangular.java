package caixas;

public class Retangular extends Caixa{

	private double lado1;
	private double lado2;
	
	public Retangular(String descUnica, String personalizacao, double lado1, double lado2) {
		super(personalizacao, personalizacao);
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	@Override
	public double areaDaTampa() {
		double areaDaTampa;
		areaDaTampa = lado1 * lado2;
		return areaDaTampa;
	}

	@Override
	public double precoTotal() {
		double precoTotal;
		precoTotal = 10 * areaDaTampa();
		return precoTotal;
	}
}
