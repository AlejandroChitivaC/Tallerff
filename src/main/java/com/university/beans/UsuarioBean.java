package com.university.beans;

import com.university.dao.UsuarioDAO;
import com.university.dao.impl.UsuarioDAOImpl;
import com.university.entity.Usuario;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import java.util.Date;
import java.util.List;

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
		return "gerenciarUsuario";
	}

	public String prepararModificarUsuario() {
		usuario = (Usuario) (listaUsuarios.getRowData());
		return "gerenciarUsuario";
	}

	public String eliminarUsuario() {
		Usuario usuarioTemp = (Usuario) (listaUsuarios.getRowData());
		UsuarioDAO dao = new UsuarioDAOImpl();
		usuarioTemp.setActivo("I");
		dao.update(usuarioTemp);
		// dao.remove(usuarioTemp);
		return "index";
	}

	public String adicionarUsuario() {
		UsuarioDAO dao = new UsuarioDAOImpl();
		dao.save(usuario);
		return "index";
	}

	public String modificarUsuario() {
		UsuarioDAO dao = new UsuarioDAOImpl();
		dao.update(usuario);
		return "index";
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
