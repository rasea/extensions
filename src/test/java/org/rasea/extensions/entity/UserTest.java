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
package org.rasea.extensions.entity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.util.Random;

import org.junit.Test;

public class UserTest {

	@Test
	public void testUser() {
		final User user = new User();

		assertNull(user.getAlternateEmail());
		assertNull(user.getDisplayName());
		assertNull(user.getEmail());
		assertNull(user.getName());
		assertNull(user.getPassword());
	}

	@Test
	public void testUserString() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());
		final User user = new User(SAMPLE);

		assertNull(user.getAlternateEmail());
		assertNull(user.getDisplayName());
		assertNull(user.getEmail());
		assertNull(user.getPassword());

		assertEquals(SAMPLE, user.getName());
	}

	@Test
	public void testEqualsObject() {
		final String SAMPLE = "Test";

		final User user1 = new User();
		User user2 = new User();
		assertEquals(user1, user2);

		user1.setName(SAMPLE + "1");
		user2.setName(SAMPLE + "2");
		assertFalse(user1.equals(user2));

		user1.setName(SAMPLE);
		user2.setName(SAMPLE.toLowerCase());
		assertFalse(user1.equals(user2));

		user1.setName(SAMPLE);
		user2.setName(SAMPLE);
		assertEquals(user1, user2);

		user1.setName(null);
		user1.setDisplayName(SAMPLE + "1");
		user2.setName(null);
		user2.setDisplayName(SAMPLE + "2");
		assertEquals(user1, user2);

		user1.setName(SAMPLE);
		user1.setDisplayName(SAMPLE + "1");
		user2.setName(SAMPLE);
		user2.setDisplayName(SAMPLE + "2");
		assertEquals(user1, user2);

		user2 = null;
		assertFalse(user1.equals(user2));
	}

	@Test
	public void testAlternateEmail() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setAlternateEmail(SAMPLE);

		assertEquals(SAMPLE, user.getAlternateEmail());
	}

	@Test
	public void testDisplayName() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setDisplayName(SAMPLE);

		assertEquals(SAMPLE, user.getDisplayName());
	}

	@Test
	public void testEmail() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setEmail(SAMPLE);

		assertEquals(SAMPLE, user.getEmail());
	}

	@Test
	public void testName() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setName(SAMPLE);

		assertEquals(SAMPLE, user.getName());
	}

	@Test
	public void testPassword() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setPassword(SAMPLE);

		assertEquals(SAMPLE, user.getPassword());
	}

	@Test
	public void testIsEnabled() {
		final Boolean SAMPLE = true;

		final User user = new User();
		user.setEnabled(SAMPLE);

		assertEquals(SAMPLE, user.isEnabled());
	}

}
