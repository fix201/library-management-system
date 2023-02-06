package com.harrisburgu.lms.entity;

public class Librarian {
    private Integer id;
    private String  name;
    private String phoneNumber;
    private String address;
    private String ssn;
    private String emergencyContact;
    private Integer libraryBranchID;
    private Integer accessLevel;

    public Librarian() {

    }

    public Librarian(Integer id, String name, String phoneNumber, String address, String ssn, String emergencyContact, Integer libraryBranchID, Integer accessLevel) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.ssn = ssn;
        this.emergencyContact = emergencyContact;
        this.libraryBranchID = libraryBranchID;
        this.accessLevel = accessLevel;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getSsn() {
        return ssn;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public Integer getLibraryBranchID() {
        return libraryBranchID;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public void setLibraryBranchID(Integer libraryBranchID) {
        this.libraryBranchID = libraryBranchID;
    }

    public void setAccessLevel(Integer accessLevel) {
        this.accessLevel = accessLevel;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", libraryBranchID=" + libraryBranchID +
                ", accessLevel=" + accessLevel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Librarian librarian = (Librarian) o;

        if (!id.equals(librarian.id)) return false;
        if (!name.equals(librarian.name)) return false;
        if (!phoneNumber.equals(librarian.phoneNumber)) return false;
        if (!address.equals(librarian.address)) return false;
        if (!ssn.equals(librarian.ssn)) return false;
        if (!emergencyContact.equals(librarian.emergencyContact)) return false;
        if (!libraryBranchID.equals(librarian.libraryBranchID)) return false;
        return accessLevel.equals(librarian.accessLevel);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + phoneNumber.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + ssn.hashCode();
        result = 31 * result + emergencyContact.hashCode();
        result = 31 * result + libraryBranchID.hashCode();
        result = 31 * result + accessLevel.hashCode();
        return result;
    }
}
