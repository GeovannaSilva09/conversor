package br.dev.geovanna.temperatura.model;

public class Temperatura {

	private double celsius;

	public double getCelsius() {
		return celsius;

	}

	public void setCelsius(double celsius) {
		this.celsius = celsius;

	}

	// Métodos de conversão adicionados
	public double converterParaKelvin() {
		return celsius + 273.15;

	}

	public double converterParaFahreinheit() {
		return celsius = ((celsius * 1.8) + 32);

	}

}
