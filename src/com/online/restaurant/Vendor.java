package com.online.restaurant;

public class Vendor {
    private String name;
    private String address;
    private long phoneNumber;
    private String emailid;
    private String city;
    private String state;
    private String pureVeg;

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

    public long getPhonenumber() {
        return phoneNumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phoneNumber = phonenumber;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPureVeg() {
        return pureVeg;
    }

    public void setPureVeg(String pureVeg) {
        this.pureVeg = pureVeg;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRATING() {
        return RATING;
    }

    public void setRATING(String RATING) {
        this.RATING = RATING;
    }

    private String category;
    private String RATING;

}
