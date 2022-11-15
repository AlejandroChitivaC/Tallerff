package com.university.dao;

import com.university.entity.Usuario;

import java.util.List;

public interface UsuarioDAO {

	public void save(Usuario usuario);

	public Usuario getUsuario(long id);

	public List<Usuario> list();

	public void remove(Usuario usuario);

	public void update(Usuario usuario);

}
