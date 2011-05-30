package org.rasea.extensions.entity;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class UserTest {

	@Test
	public void testUser() {
		final User user = new User();

		Assert.assertNull(user.getAlternateEmail());
		Assert.assertNull(user.getDisplayName());
		Assert.assertNull(user.getEmail());
		Assert.assertNull(user.getName());
		Assert.assertNull(user.getPassword());
	}

	@Test
	public void testUserString() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());
		final User user = new User(SAMPLE);

		Assert.assertNull(user.getAlternateEmail());
		Assert.assertNull(user.getDisplayName());
		Assert.assertNull(user.getEmail());
		Assert.assertNull(user.getPassword());

		Assert.assertEquals(SAMPLE, user.getName());
	}

	@Test
	public void testEqualsObject() {
		final String SAMPLE = "Test";

		final User user1 = new User();
		User user2 = new User();
		Assert.assertEquals(user1, user2);

		user1.setName(SAMPLE + "1");
		user2.setName(SAMPLE + "2");
		Assert.assertFalse(user1.equals(user2));

		user1.setName(SAMPLE);
		user2.setName(SAMPLE.toLowerCase());
		Assert.assertFalse(user1.equals(user2));

		user1.setName(SAMPLE);
		user2.setName(SAMPLE);
		Assert.assertEquals(user1, user2);

		user1.setName(null);
		user1.setDisplayName(SAMPLE + "1");
		user2.setName(null);
		user2.setDisplayName(SAMPLE + "2");
		Assert.assertEquals(user1, user2);

		user1.setName(SAMPLE);
		user1.setDisplayName(SAMPLE + "1");
		user2.setName(SAMPLE);
		user2.setDisplayName(SAMPLE + "2");
		Assert.assertEquals(user1, user2);

		user2 = null;
		Assert.assertFalse(user1.equals(user2));
	}

	@Test
	public void testAlternateEmail() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setAlternateEmail(SAMPLE);

		Assert.assertEquals(SAMPLE, user.getAlternateEmail());
	}

	@Test
	public void testDisplayName() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setDisplayName(SAMPLE);

		Assert.assertEquals(SAMPLE, user.getDisplayName());
	}

	@Test
	public void testEmail() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setEmail(SAMPLE);

		Assert.assertEquals(SAMPLE, user.getEmail());
	}

	@Test
	public void testName() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setName(SAMPLE);

		Assert.assertEquals(SAMPLE, user.getName());
	}

	@Test
	public void testPassword() {
		final String SAMPLE = String.valueOf(new Random().nextFloat());

		final User user = new User();
		user.setPassword(SAMPLE);

		Assert.assertEquals(SAMPLE, user.getPassword());
	}

	@Test
	public void testIsEnabled() {
		final Boolean SAMPLE = true;

		final User user = new User();
		user.setEnabled(SAMPLE);

		Assert.assertEquals(SAMPLE, user.isEnabled());
	}

}
