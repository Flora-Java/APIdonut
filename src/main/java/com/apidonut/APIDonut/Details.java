package com.apidonut.APIDonut;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Details {
	private String id;
	private String name;
	private String calories;
	private List<String> extras;
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
	public String getCalories() {
		return calories;
	}
	public void setCalories(String calories) {
		this.calories = calories;
	}
	public List<String> getExtras() {
		return extras;
	}
	public void setExtras(List<String> extras) {
		this.extras = extras;
	}
	public Details(String id, String name, String calories, List<String> extras) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.extras = extras;
	}
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Details [id=" + id + ", name=" + name + ", calories=" + calories + ", extras=" + extras + "]";
	}
	

}
