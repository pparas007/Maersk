package com.maersk.demo;

import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.naming.directory.Attributes;

import org.springframework.ldap.core.AttributesMapper;



public class MyAttributeMapperJSON implements AttributesMapper<String>{

	@Override
	public String mapFromAttributes(Attributes attributes) throws NamingException {
		NamingEnumeration<String>ids= attributes.getIDs();
		while(ids.hasMore()) {
			String id=ids.next();
			
			System.out.println(id+": "+	attributes.get(id).get());
		}
		System.out.println(ids.next());
		return null;
	}

}
