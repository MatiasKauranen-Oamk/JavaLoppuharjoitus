package com.matiask.lopputyoapp.data;

public class Student {
    private long idnum;
    private String name;
    private String address;
    private String email;
    private static long idnumcount = 0;

    // Tyhjä Konstruktori
    public Student() {
        this("");
    }

    // Jokainen oppilas saa oman ID:n
    public Student(String name) {
        this.idnum = idnumcount++;
    }

    // Parametrillinen Konstruktori + ID laskuri
    public Student(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.idnum = idnumcount++;
    }

    // Getterit ja Setterit
    public long getIdnum() {
        return this.idnum;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
