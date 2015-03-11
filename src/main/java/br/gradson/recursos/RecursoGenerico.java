package br.gradson.recursos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.gradson.entity.usuario.Usuario;

public interface RecursoGenerico<T> {

	@POST
	@Path("cadastrar")
	@Produces("application/json")
	@Consumes("application/json")
	public Response cadastrar(T pojo);

	@GET
	@Produces("application/json")
	@Path("buscar/id/{id}")
	public Usuario buscarPorId(@PathParam("id") Long id);

	@GET
	@Produces("application/json")
	@Path("buscar/ativos")
	public List<T> buscarAtivos();

}
