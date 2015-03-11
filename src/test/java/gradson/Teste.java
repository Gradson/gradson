package gradson;

import java.util.List;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import br.gradson.business.usuario.UsuarioBusiness;
import br.gradson.entity.usuario.Usuario;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public class Teste {
	
	@Autowired
	private UsuarioBusiness business;
	
	//@Test
	public void deveBuscarPorId(){
		Usuario usuario = null;
		try {
			usuario = business.buscarPorId(1l);
			System.out.println(usuario.getNome());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//@Test
	public void deveAvisarQueUsuarioNaoEstaCadastrado() throws Exception{
		System.out.println("inicio");
		Usuario usuario = business.buscarPorId(100l);
		System.out.println("Retorno: ");
		try {
			System.out.println(usuario.getNome());
		} catch (Exception e) {
			usuario = new Usuario();
		}
		System.out.println("encerra");
	}
	
	//@Test
	public void deveCadastraUmUsuario() throws Exception {
		Usuario usuario = new Usuario("TEse", "@bol", "teste");
		business.salvar(usuario);
	}
	
	@Test
	public void deveBuscarTodosAtivos() {
		List<Usuario> usuariosAtivos = business.buscarTodosAtivos();
		assertTrue("Correto", usuariosAtivos.size() > 0);
	}
}
