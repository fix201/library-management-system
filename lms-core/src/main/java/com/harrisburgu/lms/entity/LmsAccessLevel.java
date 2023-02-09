package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class LmsAccessLevel {
	
	@Id
	@GeneratedValue
	private Long access_level;
	private String description;
	
	public Long getId() {
		return access_level;
	}

	public void setId(Long access_level) {
		this.access_level = access_level;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		LmsAccessLevel that = (LmsAccessLevel) o;

		if (!access_level.equals(that.access_level)) return false;
		return description.equals(that.description);
	}

	@Override
	public int hashCode() {
		int result = access_level.hashCode();
		result = 31 * result + description.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "AccessLevel{" +
				"access_level=" + access_level +
				", description='" + description + '\'' +
				'}';
	}
}
