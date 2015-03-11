package br.gradson.recursos.usuario;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gradson.business.usuario.UsuarioBusiness;
import br.gradson.entity.usuario.Usuario;
import br.gradson.recursos.RecursoGenerico;

@Service("UsuarioWS")
@Path("usuario/")
public class UsuarioWS implements RecursoGenerico<Usuario>{

	@Autowired
	private UsuarioBusiness usuarioBusiness;
	
	public Response cadastrar(Usuario pojo) {
		try {
			Usuario usuario = new Usuario(pojo.getNome(), pojo.getSenha(), pojo.getEmail());
			usuarioBusiness.salvar(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Usuario buscarPorId(Long id) {
		Usuario usuario = null;
		try {
			usuario = usuarioBusiness.buscarPorId(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuario;
	}

	public List<Usuario> buscarAtivos() {
		try {
			return usuarioBusiness.buscarTodosAtivos();
		} catch (Exception e) {
			e.printStackTrace();
			return new ArrayList<Usuario>();
		}
	}

}
