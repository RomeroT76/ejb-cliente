package com.remote.ejb.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.remote.ejb.model.JListModel;
import com.remote.ejb.model.User;
import com.remote.ejb.service.UserServiceRemote;
import com.remote.ejb.views.UserGUI;

public class AgregarBTController implements ActionListener {

	private UserGUI uGui;
	private JListModel jlm;
	private UserServiceRemote usrsr;

	public AgregarBTController(UserGUI uGui, JListModel jlm, UserServiceRemote usrsr) {
		this.uGui = uGui;
		this.jlm = jlm;
		this.usrsr = usrsr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			User usr = new User();
			usr.setCedula(uGui.getCedulaTxt());
			usr.setNombre(uGui.getNombreTxt());
			usr.setCorreo(uGui.getCorreoTxt());
			usr.setRol(uGui.getRolTxt());
			usrsr.crearUsuario(usr);
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
		}
	}

}
