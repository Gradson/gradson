package br.gradson.dao.usuario;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import br.gradson.dao.DaoGenericoImpl;
import br.gradson.entity.usuario.Usuario;

@Repository("testeDeUsuario")
public class UsuarioDao extends DaoGenericoImpl<Usuario, Long>{
	
	@SuppressWarnings("unchecked")
	public List<Usuario> buscarTodosAtivos() {
		Session session = getCurrentSession();
		Transaction transaction = session.beginTransaction();
		try {
			Criteria criteria = session.createCriteria(getPersistentClass());
			criteria.add(Restrictions.eq("ativo", true));
			return (List<Usuario>)criteria.list();
		} catch (HibernateException e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();
		} finally {
			transaction.commit();
		}
	}
}
