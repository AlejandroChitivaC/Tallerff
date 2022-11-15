package com.university.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private int id;
	@Column(name = "activo", nullable = false, length = 1)
	private String activo;
	@Column(name = "apellidosNombres", nullable = false, length = 70)
	private String apellidosNombres;
	@Column(name = "celular", nullable = false, length = 30)
	private String celular;
	@Column(name = "clave", nullable = false, length = 255)
	private String clave;
	@Column(name = "correo", nullable = false, length = 60)
	private String correo;
	@Column(name = "direccion", nullable = false, length = 80)
	private String direccion;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fechaUltimoPassword", nullable = false, length = 19)
	private Date fechaUltimoPassword;
	@Column(name = "intentos", nullable = false)
	private int intentos;
	@Column(name = "login", nullable = false, length = 8)
	private String login;
	@Column(name = "tcredito", nullable = false, length = 20)
	private String tcredito;
	@Column(name = "tipoUsuario", nullable = false, length = 1)
	private String tipoUsuario;

	public Usuario() {
	}

	public Usuario(int id, String activo, String apellidosNombres, String celular, String clave, String correo,
			String direccion, Date fechaUltimoPassword, int intentos, String login, String tcredito,
			String tipoUsuario) {
		this.id = id;
		this.activo = activo;
		this.apellidosNombres = apellidosNombres;
		this.celular = celular;
		this.clave = clave;
		this.correo = correo;
		this.direccion = direccion;
		this.fechaUltimoPassword = fechaUltimoPassword;
		this.intentos = intentos;
		this.login = login;
		this.tcredito = tcredito;
		this.tipoUsuario = tipoUsuario;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActivo() {
		return this.activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getApellidosNombres() {
		return this.apellidosNombres;
	}

	public void setApellidosNombres(String apellidosNombres) {
		this.apellidosNombres = apellidosNombres;
	}

	public String getCelular() {
		return this.celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getClave() {
		return this.clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaUltimoPassword() {
		return this.fechaUltimoPassword;
	}

	public void setFechaUltimoPassword(Date fechaUltimoPassword) {
		this.fechaUltimoPassword = fechaUltimoPassword;
	}

	public int getIntentos() {
		return this.intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTcredito() {
		return this.tcredito;
	}

	public void setTcredito(String tcredito) {
		this.tcredito = tcredito;
	}

	public String getTipoUsuario() {
		return this.tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}