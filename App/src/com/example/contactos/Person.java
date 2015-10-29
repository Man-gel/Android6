package com.example.contactos;

public class Person {
	public Integer imgView;
	public String txtView;
	public String phone;
	
	public Person(Integer iv, String tv, String phNumber)
	{
		imgView = iv;
		txtView = tv;
		phone = phNumber;
	}
	public Person( Person p)
	{
		imgView = p.imgView;
		txtView = p.txtView;
		phone = p.phone;
	}

}
