package com.harrisburgu.lms.entity;

import java.util.Date;
import java.util.Objects;

public class Publisher {
    private Integer id;
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String type;
    private Date establishmentDate;
    private String isbnPrefix;

    public Publisher() {
    }

    public Publisher(Integer id, String name, String address, String phoneNumber, String email, String type, Date establishmentDate, String isbnPrefix) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.type = type;
        this.establishmentDate = establishmentDate;
        this.isbnPrefix = isbnPrefix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getIsbnPrefix() {
        return isbnPrefix;
    }

    public void setIsbnPrefix(String isbnPrefix) {
        this.isbnPrefix = isbnPrefix;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone_number='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                ", establishment_date=" + establishmentDate +
                ", isbn_prefix='" + isbnPrefix + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publisher publisher = (Publisher) o;

        if (!id.equals(publisher.id)) return false;
        if (!name.equals(publisher.name)) return false;
        if (!Objects.equals(address, publisher.address)) return false;
        if (!Objects.equals(phoneNumber, publisher.phoneNumber))
            return false;
        if (!Objects.equals(email, publisher.email)) return false;
        if (!type.equals(publisher.type)) return false;
        if (!Objects.equals(establishmentDate, publisher.establishmentDate))
            return false;
        return isbnPrefix.equals(publisher.isbnPrefix);
    }
    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + type.hashCode();
        result = 31 * result + (establishmentDate != null ? establishmentDate.hashCode() : 0);
        result = 31 * result + isbnPrefix.hashCode();
        return result;
    }
}
