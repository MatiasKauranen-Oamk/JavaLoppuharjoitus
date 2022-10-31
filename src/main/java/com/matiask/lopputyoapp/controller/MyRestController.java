package com.matiask.lopputyoapp.controller;

import com.matiask.lopputyoapp.data.Course;
import com.matiask.lopputyoapp.data.Student;
import com.matiask.lopputyoapp.service.CourseService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {

    @Autowired
    CourseService cCourse;

    @Autowired
    CourseService sStudent;

    // Näytä oppilaat
    // http://localhost:8080/students
    @GetMapping("students")
    public List<Student> getStudents() {
        return sStudent.getAllStudents();
    }

    // Lisää oppilas
    // http://localhost:8080/addstudent
    @PostMapping("addstudent")
    public Student addStudent(@RequestBody Student student) {
        sStudent.addStudent(student);
        return student;
    }

    // Näytä kurssit
    // http://localhost:8080/courses
    @GetMapping("courses")
    public List<Course> getCourses() {
        return cCourse.getAllCourses();
    }

    // Lisää kurssi
    // http://localhost:8080/addcourse
    @PostMapping("addcourse")
    public Course addCourse(@RequestBody Course course) {
        cCourse.addCourse(course);
        return course;

    }

    // Lisää oppilas kurssille
    // http://localhost:8080/addtocourse?studentid=?&courseid=?
    @GetMapping("addtocourse")
    public String addStocourse(
            @RequestParam Integer studentid, Integer courseid,
            @RequestBody(required = false) Student student) {
        cCourse.addStudentcourse(studentid, courseid);
        return "Kurssille lisäys onnistui";
    }

    // Poista oppilas kurssilta
    // http://localhost:8080/removefromcourse?studentid=?&courseid=?
    @GetMapping("removefromcourse")
    public String removefromcourse(
            @RequestParam Integer studentid, Integer courseid,
            @RequestBody(required = false) Student student) {
        cCourse.removeStudentcourse(studentid, courseid);
        return "Kurssilta poisto onnistui";
    }

}
