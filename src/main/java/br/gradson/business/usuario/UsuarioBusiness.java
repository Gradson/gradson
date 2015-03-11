package br.gradson.business.usuario;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.gradson.dao.usuario.UsuarioDao;
import br.gradson.entity.usuario.Usuario;

@Controller
public class UsuarioBusiness {
	
	@Autowired
	private UsuarioDao usuarioDao;

	public Session getCurrentSession() throws HibernateException {
		return usuarioDao.getCurrentSession();
	}

	public Usuario salvar(Usuario t) throws Exception {
		return usuarioDao.save(t);
	}

	public void salvarList(List<Usuario> t) throws Exception {
		usuarioDao.saveList(t);
	}

	public long salarId(Usuario t) throws Exception {
		return usuarioDao.saveId(t);
	}

	public Usuario merge(Usuario t) throws Exception {
		return usuarioDao.merge(t);
	}

	public void mergeList(List<Usuario> t) throws Exception {
		usuarioDao.mergeList(t);
	}

	public void remover(Usuario t) throws Exception {
		usuarioDao.remove(t);
	}

	public Usuario buscarPorId(Long id) throws Exception {
		return usuarioDao.findById(id);
	}
	
	public List<Usuario> buscarTodosAtivos() {
		return usuarioDao.buscarTodosAtivos();
	}
}
