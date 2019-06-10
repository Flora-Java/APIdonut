package com.apidonut.APIDonut;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)

public class Listdonuts {
	
	private List<Donuts> results;

	public List<Donuts> getResults() {
		return results;
	}

	public void setResults(List<Donuts> results) {
		this.results = results;
	}

	public Listdonuts(List<Donuts> results) {
		super();
		this.results = results;
	}

	public Listdonuts() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Listdonuts [results=" + results + "]";
	}

	
	

}
