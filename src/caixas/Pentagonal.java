package caixas;

public class Pentagonal extends Caixa{

	private int lado;
	private double altura;
	
	public Pentagonal(String descUnica, String personalizacao, int lado) {
		super(descUnica, personalizacao);
		this.lado = lado;
		this.altura = calcularAltura(lado);
		this.formato = "Pentagonal";
	}

	private double calcularAltura(int altura) {
		double alturaDoPentagono;
		alturaDoPentagono = (((lado / 2) * Math.sqrt(lado)) + (2 * Math.sqrt(lado))) / 2.0;
		return Math.floor(alturaDoPentagono);
	}
	
	@Override
	public double areaDaTampa() {
		double areaDaTampa;
		areaDaTampa = (5.0 * (lado * altura)) / 2.0;
		return areaDaTampa;
	}

	@Override
	public double precoTotal() {
		double precoTotal;
		precoTotal = 10 * areaDaTampa();
		return precoTotal;
	}
}
