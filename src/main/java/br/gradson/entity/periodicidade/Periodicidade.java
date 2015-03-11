package br.gradson.entity.periodicidade;

import br.gradson.entity.EntidadeAbstrata;

public class Periodicidade extends EntidadeAbstrata{
	private static final long serialVersionUID = 1L;

	private String nome;
	private int intervalo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIntervalo() {
		return intervalo;
	}
	public void setIntervalo(int intervalo) {
		this.intervalo = intervalo;
	}
}
