package com.ipartek.formacion.pojo;

public class Usuario {

	//Propiedades
	private long id;
	private String nombre;
	private String password;
	private String email;
	
	//COnstructores
	public Usuario() {
		super();
		this.id = -1;
		this.nombre = "";
		this.password = "";
		this.email = "";
	}

	//Getters y setters
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	//Funciones o metodos
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", password=" + password + ", email=" + email + "]";
	}
	
	
	
}
