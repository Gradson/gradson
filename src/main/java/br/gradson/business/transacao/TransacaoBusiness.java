package br.gradson.business.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.gradson.dao.transacao.TransacaoDao;
import br.gradson.entity.transacao.Transacao;

@Controller
public class TransacaoBusiness  {
	
	@Autowired
	private TransacaoDao dao;

	public void salvar (Transacao transacao) {
		try {
			dao.save(transacao);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
