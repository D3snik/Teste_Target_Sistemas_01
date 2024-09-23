package entities;

public class Tecnica {

	private int indice;
	private int soma;
	private int k;
	
	public Tecnica() {
	}

	public Tecnica(int indice, int soma, int k) {
		super();
		this.indice = indice;
		this.soma = soma;
		this.k = k;
	}

	public int getIndice() {
		return indice;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	public int getSoma() {
		return soma;
	}

	public void setSoma(int soma) {
		this.soma = soma;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}
	
	public double Conta() {
		while(this.k < this.indice) {
			this.k = this.k + 1; this.soma = this.soma + this.k;
		}
		return soma;
	}
}
