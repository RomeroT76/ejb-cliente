package com.remote.ejb.service;

import java.util.List;

import com.remote.ejb.model.User;

import jakarta.ejb.Remote;

@Remote
public interface UserServiceRemote {

	void crearUsuario(User user) throws Exception;
	List<User> listarUsuarios() throws Exception;
}
