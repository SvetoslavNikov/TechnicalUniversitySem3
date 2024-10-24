package javaLU.Hashfunctions.PersonClass;

public class Name {
    private String firstName;
    private String surname;
    private String familyName;

    public Name(String firstName, String surname, String familyName) {
        this.firstName = firstName;
        this.surname = surname;
        this.familyName = familyName;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
