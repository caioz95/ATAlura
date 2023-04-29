package principal;

import java.util.ArrayList;

import br.com.alura.amaZonas.calculos.CalculadoraDeTempo;
import br.com.alura.amaZonas.calculos.FiltroRecomendacao;
import br.com.alura.amaZonas.modelos.Episodio;
import br.com.alura.amaZonas.modelos.Filme;
import br.com.alura.amaZonas.modelos.Serie;

public class Principal {
	public static void main(String[] args) {
		Filme filme1 = new Filme("O Poderoso chefão",1970);
		//filme1.setNome("O Poderoso chefão");
		//filme1.setAnoDeLancamento(1970);
		filme1.setDuracaoEmMinutos(180);
		System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());

		filme1.exibeFichaTecnica();
		filme1.avalia(8);
		filme1.avalia(5);
		filme1.avalia(10);
		System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacao());
		System.out.println(filme1.mediaDasAvaliacoes());

		Serie lost = new Serie("Lost",2000);
		//lost.setNome("Lost");
		//lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporadas(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

		Filme outroFilme = new Filme("Avatar", 2023);
		//outroFilme.setNome("Avatar");
		//outroFilme.setAnoDeLancamento(2023);
		outroFilme.setDuracaoEmMinutos(200);
		System.out.println("Duração do filme: " + outroFilme.getDuracaoEmMinutos());

		Filme outroFilme2 = new Filme("Invocação do Mal",2015);
		//outroFilme2.setNome("Invocação do Mal");
		outroFilme2.setAnoDeLancamento(2015);
		outroFilme2.setDuracaoEmMinutos(120);
		outroFilme2.avalia(10);
		System.out.println("Duração do filme: " + outroFilme2.getDuracaoEmMinutos());

		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(filme1);
		calculadora.inclui(outroFilme);
		calculadora.inclui(outroFilme2);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(filme1);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
	
		ArrayList<Filme> listaDeFilmes = new ArrayList<>();
		listaDeFilmes.add(outroFilme2);
		listaDeFilmes.add(outroFilme);
		listaDeFilmes.add(filme1);
		System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
		System.out.println("Primeiro Filme: " + listaDeFilmes.get(0).getNome());
		System.out.println(listaDeFilmes);
		System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());
		
		
	
	
	}
	
	
}
