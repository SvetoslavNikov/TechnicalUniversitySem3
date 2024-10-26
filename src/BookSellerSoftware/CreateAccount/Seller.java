package BookSellerSoftware.CreateAccount;

public class Seller {
    private String name;
    private String surname;
    private String company;
    private String phoneNumber;
    private String email;



    //Constructors
    public Seller(String name, String surname, String company, String phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.company = company;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Seller() {
        this.name = "";
        this.surname = "";
        this.company = "";
        this.phoneNumber = "";
        this.email = "";
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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
}

