package com.matiask.lopputyoapp.data;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private long id;
    private String name;
    private String teacher;
    private String classroom;
    private static long idCounter = 0;
    private List<Student> studentids = new ArrayList<>();

    // Tyhjä Konstruktori
    public Course() {
        this("");
    }

    // Jokainen kurssi saa oman ID:n
    public Course(String name) {
        this.id = idCounter++;
    }

    // Parametrillinen Konstruktori + ID laskuri
    public Course(String name, String teacher, String classroom) {
        this.name = name;
        this.teacher = teacher;
        this.classroom = classroom;
        this.id = idCounter++;
    }

    public void addtocourse(Student student) {
        studentids.add(student);
    }

    public void removefromcourse(Student student) {
        studentids.remove(student);
    }

    // Getterit ja Setterit
    public List<Student> getStudents() {
        return new ArrayList<>(this.studentids);
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getTeacher() {
        return this.teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getclassroom() {
        return this.classroom;
    }

    public void setclassroom(String classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }
}