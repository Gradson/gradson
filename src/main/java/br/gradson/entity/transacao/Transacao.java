package br.gradson.entity.transacao;

import java.util.List;

import br.gradson.entity.EntidadeAbstrata;
import br.gradson.entity.categoria.Categoria;
import br.gradson.entity.transacao.enums.TipoDeEntrada;
import br.gradson.entity.transacao.tipo.Tipo;

public class Transacao extends EntidadeAbstrata {
	private static final long serialVersionUID = 1L;
	
	private TipoDeEntrada tipoEntrada;
	private Tipo tipo;
	private int qtdParcelas;
	private Double valor;
	private String descricao;
	private String comentário;
	private List<Categoria> categoria;
	
	public TipoDeEntrada getTipoEntrada() {
		return tipoEntrada;
	}
	public void setTipoEntrada(TipoDeEntrada tipoEntrada) {
		this.tipoEntrada = tipoEntrada;
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	public int getQtdParcelas() {
		return qtdParcelas;
	}
	public void setQtdParcelas(int qtdParcelas) {
		this.qtdParcelas = qtdParcelas;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getComentário() {
		return comentário;
	}
	public void setComentário(String comentário) {
		this.comentário = comentário;
	}
	public List<Categoria> getCategoria() {
		return categoria;
	}
	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	
}
