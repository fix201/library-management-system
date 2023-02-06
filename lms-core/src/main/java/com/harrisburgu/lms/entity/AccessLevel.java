package com.harrisburgu.lms.entity;

public class AccessLevel {
	
	private Long id;
	private String description;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

		AccessLevel that = (AccessLevel) o;

		if (!id.equals(that.id)) return false;
		return description.equals(that.description);
	}

	@Override
	public int hashCode() {
		int result = id.hashCode();
		result = 31 * result + description.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "AccessLevel{" +
				"id=" + id +
				", description='" + description + '\'' +
				'}';
	}
}
