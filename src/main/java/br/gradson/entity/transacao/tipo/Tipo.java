package br.gradson.entity.transacao.tipo;

import java.util.Calendar;

import br.gradson.entity.EntidadeAbstrata;
import br.gradson.entity.periodicidade.Periodicidade;
import br.gradson.entity.periodo.Periodo;

public class Tipo extends EntidadeAbstrata {
	private static final long serialVersionUID = 1L;
	
	private Calendar dataMovimentacao;
	private Periodo periodoMovimentacao;
	private Periodicidade periodicidade;
	
	public Calendar getDataMovimentacao() {
		return dataMovimentacao;
	}
	public void setDataMovimentacao(Calendar dataMovimentacao) {
		this.dataMovimentacao = dataMovimentacao;
	}
	public Periodo getPeriodoMovimentacao() {
		return periodoMovimentacao;
	}
	public void setPeriodoMovimentacao(Periodo periodoMovimentacao) {
		this.periodoMovimentacao = periodoMovimentacao;
	}
	public Periodicidade getPeriodicidade() {
		return periodicidade;
	}
	public void setPeriodicidade(Periodicidade periodicidade) {
		this.periodicidade = periodicidade;
	}

}
