package com.remote.ejb.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.remote.ejb.model.JListModel;
import com.remote.ejb.model.User;
import com.remote.ejb.service.UserServiceRemote;

public class ListBTController implements ActionListener {

	private JListModel jlm;
	private UserServiceRemote usrsr;

	public ListBTController(JListModel jlm, UserServiceRemote usrsr) {
		this.jlm = jlm;
		this.usrsr = usrsr;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		try {
			jlm.clear();
			for(User u : usrsr.listarUsuarios()) {
				jlm.addElement(u);
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
