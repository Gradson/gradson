package br.gradson.dao.transacao;

import org.springframework.stereotype.Repository;

import br.gradson.dao.DaoGenericoImpl;
import br.gradson.entity.transacao.Transacao;

@Repository("transacaoDao")
public class TransacaoDao extends DaoGenericoImpl<Transacao, Long> {

}
