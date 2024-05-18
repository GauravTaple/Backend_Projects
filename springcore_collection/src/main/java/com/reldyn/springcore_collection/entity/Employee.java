package com.reldyn.springcore_collection.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private int id;
	private String name;
	private List<String> phones;
	private Set<String> addresses;
	private Map<String , String> courses;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phones=" + phones + ", addresses=" + addresses
				+ ", courses=" + courses + "]";
	}
	
	
	

}
