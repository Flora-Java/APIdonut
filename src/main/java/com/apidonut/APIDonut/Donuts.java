package com.apidonut.APIDonut;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Donuts {
	private String id;
	private String name;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Donuts(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Donuts() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Donuts [id=" + id + ", name=" + name + "]";
	}
	
	

}
