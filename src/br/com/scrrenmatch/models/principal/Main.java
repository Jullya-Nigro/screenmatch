package br.com.scrrenmatch.models.principal;

import br.com.scrrenmatch.models.calculos.CalculadoraDeTempo;
import br.com.scrrenmatch.models.calculos.FilmeRecomendacao;
import br.com.scrrenmatch.models.modelos.Episodio;
import br.com.scrrenmatch.models.modelos.Filme;
import br.com.scrrenmatch.models.modelos.Serie;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Filme meufilme = new Filme("O poderoso chefão", 1970);
        meufilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme " + meufilme.getDuracaoEmMinutos());

        meufilme.exibeFichaTecnica();
        meufilme.avalia(8);
        meufilme.avalia(5);
        meufilme.avalia(10);
        System.out.println("Total de avaliações " + meufilme.getTotalDeAvaliacoes());
        System.out.println(meufilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para marotonar Lost " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meufilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FilmeRecomendacao filtro = new FilmeRecomendacao();
        filtro.filtra(meufilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisuzalizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meufilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());

    }
}
