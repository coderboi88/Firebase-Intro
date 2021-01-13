package com.example.fireintro;

public class Customers {
    private String firstName;
    private String lastNAme;
    private String email;
    private int age;

    public Customers() {
    }

    public Customers(String firstName, String lastNAme, String email, int age) {
        this.firstName = firstName;
        this.lastNAme = lastNAme;
        this.email = email;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastNAme() {
        return lastNAme;
    }

    public void setLastNAme(String lastNAme) {
        this.lastNAme = lastNAme;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
