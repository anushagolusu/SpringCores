package com.SpringCore.Model;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private List<String> skillList;
	private Set<String> phoneNumber;
	private Map<String,String> projects;
	private Properties userProperties;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<String> skillList) {
		this.skillList = skillList;
	}
	public Set<String> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Set<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Map<String, String> getProjects() {
		return projects;
	}
	public void setProjects(Map<String, String> projects) {
		this.projects = projects;
	}
	public Properties getUserProperties() {
		return userProperties;
	}
	public void setUserProperties(Properties userProperties) {
		this.userProperties = userProperties;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", skillList=" + skillList + ", phoneNumber=" + phoneNumber
				+ ", projects=" + projects + ", userProperties=" + userProperties + "]";
	}
	
}
