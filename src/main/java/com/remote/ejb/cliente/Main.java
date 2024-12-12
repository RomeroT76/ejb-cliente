package com.remote.ejb.cliente;

import java.util.Hashtable;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;

import com.remote.ejb.controller.AgregarBTController;
import com.remote.ejb.controller.ListBTController;
import com.remote.ejb.model.JListModel;
import com.remote.ejb.model.User;
import com.remote.ejb.service.UserServiceRemote;
import com.remote.ejb.views.UserGUI;

public class Main {

	private UserServiceRemote userSR;
	private List<User> users;
	
	public void inicializar() throws Exception {
		Hashtable<String, Object> jndiProperties = new Hashtable<String, Object>();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY, "org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
		
		try {
			Context context = new InitialContext(jndiProperties);
			userSR = (UserServiceRemote) context
					.lookup("ejb:/servidor/UserService!com.remote.ejb.service.UserServiceRemote");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}
	
	public void registrarUser(String cedula, String nombre, String correo, String rol) throws Exception{
		User usr = new User();
		usr.setCedula(cedula);
		usr.setNombre(nombre);
		usr.setCorreo(correo);
		usr.setRol(rol);
		
		userSR.crearUsuario(usr);
		System.out.println("Usuario creado con exito");
	}
	
	public void listar() throws Exception{
		users = userSR.listarUsuarios();
		
		for(User u : users) {
			System.out.println(u.getCedula());
			System.out.println(u.getNombre());
			System.out.println(u.getCorreo());
			System.out.println(u.getRol());
		}
	}
	
	
	
	public UserServiceRemote getUserSR() {
		return userSR;
	}

	public static void main(String[] args) {
		try {
			Main main = new Main();
			main.inicializar();
			main.registrarUser("0706623873", "Roberto", "Romero", "ADMIN");
			System.out.println("------------------------------------------------------------------------------------------------");
			main.listar();
			UserGUI uGui = new UserGUI();
			JListModel jlm = new JListModel();
			AgregarBTController abtc = new AgregarBTController(uGui, jlm, main.getUserSR());
			ListBTController lbtc = new ListBTController(jlm, main.getUserSR());
			uGui.registerListModel(jlm);
			uGui.addActionListener(abtc, lbtc);
			uGui.setVisible(true);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
