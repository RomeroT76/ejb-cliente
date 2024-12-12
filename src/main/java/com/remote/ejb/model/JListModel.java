package com.remote.ejb.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.AbstractListModel;

public class JListModel extends AbstractListModel<User>{
	
	private List<User> users;
	
	public JListModel() {
		users = new ArrayList<User>();
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return users.size();
	}

	@Override
	public User getElementAt(int index) {
		// TODO Auto-generated method stub
		return users.get(index);
	}
	
	public void addElement(User u) {
		int size = users.size();
		users.add(u);
		fireIntervalAdded(this, size, size);
	}
	
	public void removeElement(User u) {
		int size = users.size();
		users.remove(u);
		fireIntervalRemoved(this, size, size);
	}
	
	public void clear() {
		this.users.clear();
	}
}
