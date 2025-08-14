package br.com.scrrenmatch.models.modelos;

import br.com.scrrenmatch.models.calculos.Classificavel;

public class Episodio implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVisuzalizacoes;

    public int getTotalVisuzalizacoes() {
        return totalVisuzalizacoes;
    }

    public void setTotalVisuzalizacoes(int totalVisuzalizacoes) {
        this.totalVisuzalizacoes = totalVisuzalizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassificacao(){
        if (totalVisuzalizacoes > 100){
            return 4;
        }else{
            return 2;
        }
    }
    @Override
    public String toString() {
        return "";
    }
}