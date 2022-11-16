package com.university.beans;

import com.university.dao.UsuarioDAO;
import com.university.dao.impl.UsuarioDAOImpl;
import com.university.entity.Usuario;

import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private Usuario usuario;
	private DataModel listaUsuarios;

	public String prepararAdicionarUsuario() {
		usuario = new Usuario();
		usuario.setActivo("A");
		usuario.setFechaUltimoPassword(new Date());
		usuario.setIntentos(0);
		return "/usuario/registroNuevo.xhtml?faces-redirect=true";
	}

	public String prepararModificarUsuario() {
		usuario = (Usuario) (listaUsuarios.getRowData());
		return "/usuario/modificarRegistro.xhtml?faces-redirect=true";
	}

	public String eliminarUsuario() {
		Usuario usuarioTemp = (Usuario) (listaUsuarios.getRowData());
		UsuarioDAO dao = new UsuarioDAOImpl();
		usuarioTemp.setActivo("I");
		dao.update(usuarioTemp);
		// dao.remove(usuarioTemp);
		return "/usuario/nuevaConsultaRich.xhtml?faces-redirect=true";
	}

	public String adicionarUsuario() {
		UsuarioDAO dao = new UsuarioDAOImpl();
		dao.save(usuario);
		return "/usuario/nuevaConsultaRich.xhtml?faces-redirect=true";
	}

	public String modificarUsuario() {
		UsuarioDAO dao = new UsuarioDAOImpl();
		dao.update(usuario);
		return "/usuario/nuevaConsultaRich.xhtml?faces-redirect=true";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public DataModel getListarUsuarios() {
		List<Usuario> lista = new UsuarioDAOImpl().list();
		listaUsuarios = new ListDataModel(lista);
		return listaUsuarios;
	}

}
