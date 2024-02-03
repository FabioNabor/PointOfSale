package models.entities;


public abstract class Store{

    protected int pointofsafe;

    protected String namesafe;

    protected String address;

    protected String contact;

    protected String email;

    //Taxas

    protected double daily;

    protected double month;

    protected double year;


    public Store() {

    }


    public Store(int pointofsafe, String namesafe, String address, String contact, String email,
            double daily, double month, double year) {
        this.pointofsafe = pointofsafe;
        this.namesafe = namesafe;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.daily = daily;
        this.month = month;
        this.year = year;
    }

    public int getPointofsafe() {
        return pointofsafe;
    }

    public String getNamesafe() {
        return namesafe;
    }

    public String getAddress() {
        return address;
    }

    public String getContact() {
        return contact;
    }

    public String getEmail() {
        return email;
    }

    public double getDaily() {
        return daily;
    }

    public double getMonth() {
        return month;
    }

    public double getYear() {
        return year;
    }

}
