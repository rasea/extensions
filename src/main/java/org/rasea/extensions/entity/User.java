package org.rasea.extensions.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "name", "displayName", "email", "alternateEmail",
		"enabled" })
public final class User implements Serializable {

	private static final long serialVersionUID = -1957817738166041742L;

	@XmlID
	@XmlElement(required = true)
	private String name;

	@XmlTransient
	private String password;

	@XmlElement(required = true)
	private String displayName;

	@XmlElement(required = false)
	private String email;

	@XmlElement(required = false)
	private String alternateEmail;

	@XmlElement(required = true)
	private boolean enabled;

	public User() {
		super();
	}

	public User(final String username) {
		this.name = username;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		final User other = (User) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		return true;
	}

	public String getAlternateEmail() {
		return this.alternateEmail;
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public String getEmail() {
		return this.email;
	}

	public String getName() {
		return this.name;
	}

	public String getPassword() {
		return this.password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1; // NOPMD by cleverson on 05/12/09 15:23
		result = prime * result
				+ (this.name == null ? 0 : this.name.hashCode());
		return result;
	}

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setAlternateEmail(final String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public void setDisplayName(final String displayName) {
		this.displayName = displayName;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public void setEnabled(final boolean enabled) {
		this.enabled = enabled;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setPassword(final String password) {
		this.password = password;
	}
}
