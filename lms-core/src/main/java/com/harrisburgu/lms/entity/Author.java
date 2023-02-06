package com.harrisburgu.lms.entity;

import java.util.Date;
import java.util.Objects;

public class Author {
	
	private Long id;
	private String name;
	private Character gender;
	private String email;
	private Date dob;

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

	public Character getGender() {
		return gender;
	}

	public void setGender(Character gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Author author = (Author) o;

		if (!id.equals(author.id)) return false;
		if (!name.equals(author.name)) return false;
		if (!Objects.equals(gender, author.gender)) return false;
		if (!Objects.equals(email, author.email)) return false;
		return Objects.equals(dob, author.dob);
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + name.hashCode();
		result = 31 * result + (gender != null ? gender.hashCode() : 0);
		result = 31 * result + (email != null ? email.hashCode() : 0);
		result = 31 * result + (dob != null ? dob.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "Author{" +
				"id=" + id +
				", name='" + name + '\'' +
				", gender=" + gender +
				", email='" + email + '\'' +
				", dob=" + dob +
				'}';
	}
}
