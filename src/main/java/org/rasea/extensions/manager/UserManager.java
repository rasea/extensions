package org.rasea.extensions.manager;

import java.io.Serializable;
import java.util.List;

import org.rasea.extensions.entity.User;


public interface UserManager extends Serializable {
	
	boolean authenticate(final String username, final String password)
			throws UserManagerException;
	
	void changePassword(final String username, final String password)
			throws UserManagerException;
	
	void delete(final User user) throws UserManagerException;
	
	List<User> findAll() throws UserManagerException;
	
	List<User> findByFilter(final String filter) throws UserManagerException;
	
	void insert(final User user) throws UserManagerException;
	
	User load(final String username) throws UserManagerException;
	
	void update(final User user) throws UserManagerException;
}
