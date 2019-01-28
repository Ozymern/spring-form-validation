package com.ozymern.spring.form.validation.commands;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserCommand implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

	@Size(min=3, max=30) 
    @NotEmpty
	private String name;

	@Size(min=3, max=50) 
	@NotEmpty
	private String lastNames;

	 @NotEmpty @Email
	private String email;
	
	 @Min(18)
	private int age;
	
	 @NotEmpty
	private String description;
	
	 @NotEmpty
	private String gender;


	
	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLastNames() {
		return lastNames;
	}



	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getGender() {
		return gender;
	}



	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public String toString() {
		return "UserCommand [id=" + id + ", name=" + name + ", lastNames=" + lastNames + ", email=" + email + ", age="
				+ age + ", description=" + description + ", gender=" + gender + "]";
	}



	 
	
	
}
