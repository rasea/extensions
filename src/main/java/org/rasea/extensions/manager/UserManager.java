/*
 * Rasea Extensions
 * 
 * Copyright (c) 2008, Rasea <http://rasea.org>. All rights reserved.
 *
 * Rasea Extensions is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://gnu.org/licenses>
 * or write to the Free Software Foundation, Inc., 51 Franklin Street,
 * Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.rasea.extensions.manager;

import java.io.Serializable;
import java.util.List;

import org.rasea.extensions.entity.User;

public interface UserManager extends Serializable {

	boolean authenticate(final String username, final String password) throws UserManagerException;

	void changePassword(final String username, final String password) throws UserManagerException;

	void delete(final User user) throws UserManagerException;

	List<User> findAll() throws UserManagerException;

	List<User> findByFilter(final String filter) throws UserManagerException;

	void insert(final User user) throws UserManagerException;

	User load(final String username) throws UserManagerException;

	void update(final User user) throws UserManagerException;
}
