package caixas;

public class Circular extends Caixa{
	
	private double raio;

	public Circular(String descUnica, String personalizacao, double raio) {
		super(descUnica, personalizacao);
		this.raio = raio;
		
	}

	@Override
	public double areaDaTampa() {
		double areaDaTampa;
		areaDaTampa = Math.PI * Math.pow(raio, 2);
		return Math.floor(areaDaTampa);
	}

	@Override
	public double precoTotal() {
		double precoTotal;
		precoTotal = 10 * areaDaTampa();
		return Math.floor(precoTotal);
	}

}
