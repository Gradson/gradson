package br.gradson.entity.usuario;

import javax.persistence.Entity;
import javax.persistence.Table;

import br.gradson.entity.EntidadeAbstrata;
import br.gradson.pojo.usuario.UsuarioPojo;

@Entity
@Table(name = "usuario")
public class Usuario extends EntidadeAbstrata {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String email;
	private String senha;
	public Usuario(String nome, String email, String senha) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
	}
	public Usuario() {
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public UsuarioPojo constroiPojo() {
		return new UsuarioPojo(nome);
	}
}
