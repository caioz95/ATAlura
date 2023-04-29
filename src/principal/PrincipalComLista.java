package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.amaZonas.modelos.Titulo;
import br.com.alura.amaZonas.modelos.Filme;
import br.com.alura.amaZonas.modelos.Serie;

public class PrincipalComLista {
	public static void main(String[] args) {
		Filme filme1 = new Filme("O Poderoso chefão", 1970);
		filme1.avalia(10);
		Serie lost = new Serie("Lost", 2000);
		lost.avalia(10);
		Filme outroFilme = new Filme("Avatar", 2023);
		outroFilme.avalia(8);
		Filme outroFilme2 = new Filme("Invocação do Mal", 2015);
		outroFilme2.avalia(10);

		ArrayList<Titulo> lista = new ArrayList<>();
		lista.add(outroFilme2);
		lista.add(outroFilme);
		lista.add(filme1);
		lista.add(lost);

		for (Titulo item : lista) {
			System.out.println(item.getNome());
			if (item instanceof Filme filme && filme.getClassificacao() > 2) {
				System.out.println("Classificação " + filme.getClassificacao() );
				
			}
			
		}
		List<String> buscaPorArtista = new LinkedList<>();
		buscaPorArtista.add("Adam Sandler");
		buscaPorArtista.add("Caio");
		buscaPorArtista.add("Miguel");
		System.out.println(buscaPorArtista);
		
		
		Collections.sort(buscaPorArtista);
		System.out.println(buscaPorArtista);
		
		
		Collections.sort(lista);
		System.out.println(lista);
		
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println("Ordenando por ano ");
		System.out.println(lista);
	}
}
