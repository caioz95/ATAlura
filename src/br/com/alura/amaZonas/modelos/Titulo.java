package br.com.alura.amaZonas.modelos;

public class Titulo implements Comparable <Titulo>{

	public String nome;
	private int anoDeLancamento;
	private boolean incluidoNoPlano;
	private double somaDasAvaliacao;
	private int totalDeAvaliacao;
	private int duracaoEmMinutos;

	public Titulo(String nome, int anoDeLancamento) {
		this.nome = nome;
		this.anoDeLancamento = anoDeLancamento;
	}
	
	public int getTotalDeAvaliacao() {
		return totalDeAvaliacao;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public boolean isIncluidoNoPlano() {
		return incluidoNoPlano;
	}

	public void setIncluidoNoPlano(boolean incluidoNoPlano) {
		this.incluidoNoPlano = incluidoNoPlano;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
	}

	public void avalia(double nota) {
		somaDasAvaliacao += nota;
		totalDeAvaliacao++;
	}

	public double mediaDasAvaliacoes() {
		return somaDasAvaliacao / totalDeAvaliacao;
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		
		return this.getNome().compareTo(outroTitulo.getNome());
	}

}
