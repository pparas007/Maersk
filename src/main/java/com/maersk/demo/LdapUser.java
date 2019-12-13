package com.maersk.demo;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;

@Entry(base = "dc=example,dc=com", objectClasses = { "person" })
public final class LdapUser {

    @Id
    private Name id;

    private @Attribute(name = "sn") String fullName;
    //private @Attribute(name = "mail") String email;
    //private @Attribute(name = "uidNumber") String uidNumber;

    public LdapUser() {
		// TODO Auto-generated constructor stub
	}
    
	public Name getId() {
		return id;
	}

	public void setId(Name id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
    
    
}