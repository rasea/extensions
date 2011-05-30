package org.rasea.extensions.manager;

import org.junit.Assert;
import org.junit.Test;

public class UserManagerExceptionTest {

	@Test
	public void testUserManagerException() {
		final Exception cause = new ClassNotFoundException();
		final UserManagerException exception = new UserManagerException(cause);

		Assert.assertEquals(exception.getCause(), cause);
	}

}
