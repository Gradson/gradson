package br.gradson.entity.categoria;

import br.gradson.entity.EntidadeAbstrata;

public class Categoria extends EntidadeAbstrata{
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String comentario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
}
