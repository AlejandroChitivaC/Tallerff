package com.university.dao.impl;

import com.university.dao.UsuarioDAO;
import com.university.entity.Usuario;
import com.university.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsuarioDAOImpl implements UsuarioDAO {

	public void save(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.save(usuario);
		t.commit();
	}

	public Usuario getUsuario(long id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		return (Usuario) session.load(Usuario.class, id);
	}

	public void update(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.update(usuario);
		t.commit();
	}

	public void remove(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		session.delete(usuario);
		t.commit();
	}

	public List<Usuario> list() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction t = session.beginTransaction();
		List lista = session.createQuery("from Usuario").list();
		t.commit();
		return lista;
	}

}
