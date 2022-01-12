package com.example.demo;

public class MdDTO {
	
private Movie m;
private Director d;
public MdDTO(Movie m, Director d) {
	this.m = m;
	this.d = d;
}
public Movie getM() {
	return m;
}
public void setM(Movie m) {
	this.m = m;
}
public Director getD() {
	return d;
}
public void setD(Director d) {
	this.d = d;
}

}

