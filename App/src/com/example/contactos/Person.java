package com.example.contactos;

public class Person {
	public Integer imgView;
	public String txtView;
	
	public Person(Integer iv, String tv)
	{
		imgView = iv;
		txtView = tv;
	}
	public Person( Person p)
	{
		imgView = p.imgView;
		txtView = p.txtView;
	}

}
