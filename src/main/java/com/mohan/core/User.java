package com.mohan.core;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
 
public class User implements Serializable
{
	private static final long serialVersionUID = 1L;
 
	public int age = 29;
	public String name = "mohan";
	public List<String> messages = new ArrayList<String>() {
		{
			add("msg 1");
			add("msg 2");
			add("msg 3");
		}
	};
 
	//getter and setter methods
 
	@Override
	public String toString() {
		return "User [age=" + age + ", name=" + name + ", " +
				"messages=" + messages + "]";
	}
}
