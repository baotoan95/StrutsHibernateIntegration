package com.btit95.sample.forms;

import java.io.Serializable;

import org.apache.struts.action.ActionForm;

public class User extends ActionForm implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private int age;
    private String address;

    public User() {
	// TODO Auto-generated constructor stub
    }

    public User(long id, String name, int age, String address) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.address = address;
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getAddress() {
	return address;
    }

    public void setAddress(String address) {
	this.address = address;
    }

}
