package com.maersk.demo;

import java.util.List;

import javax.naming.Name;

import org.springframework.ldap.odm.annotations.Attribute;
import org.springframework.ldap.odm.annotations.Entry;
import org.springframework.ldap.odm.annotations.Id;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entry(objectClasses = { "person" },base = "dc=example,dc=com")
public final class Person {
	@Id
	@JsonIgnore
    private Name id;
	
	private @Attribute(name = "mail") String mail;
    private @Attribute(name = "sn") String surName;
    private @Attribute(name = "cn") String commonName;
    private @Attribute(name = "objectclass") List<String> objectclass;
    
    public Person() {
		// TODO Auto-generated constructor stub
	}
    
	public Name getId() {
		return id;
	}
	public void setId(Name id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getCommonName() {
		return commonName;
	}
	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}
	public List<String> getObjectclass() {
		return objectclass;
	}
	public void setObjectclass(List<String> objectclass) {
		this.objectclass = objectclass;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", mail=" + mail + ", surName=" + surName + ", commonName=" + commonName
				+ ", objectclass=" + objectclass + "]";
	}
    
    
}
