package com.harrisburgu.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class LibraryBranch {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String address;
    private String hoursOfOperation;
    private String phoneNumber;
    private Integer capacity;
    private String email;

    public LibraryBranch() {

    }

    public LibraryBranch(Integer id, String name, String address, String hoursOfOperation, String phoneNumber, Integer capacity, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.hoursOfOperation = hoursOfOperation;
        this.phoneNumber = phoneNumber;
        this.capacity = capacity;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getHoursOfOperation() {
        return hoursOfOperation;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHoursOfOperation(String hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "LibraryBranch{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + address + '\'' +
                ", hours_of_operation='" + hoursOfOperation + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", capacity=" + capacity +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryBranch that = (LibraryBranch) o;

        if (!id.equals(that.id)) return false;
        if (!name.equals(that.name)) return false;
        if (!address.equals(that.address)) return false;
        if (!hoursOfOperation.equals(that.hoursOfOperation)) return false;
        if (!phoneNumber.equals(that.phoneNumber)) return false;
        if (!Objects.equals(capacity, that.capacity)) return false;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + hoursOfOperation.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
