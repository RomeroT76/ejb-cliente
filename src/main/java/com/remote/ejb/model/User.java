package com.remote.ejb.model;

import java.io.Serializable;

public class User implements Serializable {

	private String cedula;
	private String nombre;
	private String correo;
	private String rol;

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cedula => " + this.cedula + "Nombre => " + this.nombre;
	}

}
