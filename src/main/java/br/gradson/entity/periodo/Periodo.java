package br.gradson.entity.periodo;

import java.util.Calendar;

import br.gradson.entity.EntidadeAbstrata;

public class Periodo extends EntidadeAbstrata{
	private static final long serialVersionUID = 1L;
	
	private Calendar dataInicio;
	private Calendar dataFinal;
	
	public Calendar getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Calendar dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Calendar getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(Calendar dataFinal) {
		this.dataFinal = dataFinal;
	}
}
