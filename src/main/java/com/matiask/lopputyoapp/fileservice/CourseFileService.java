package com.matiask.lopputyoapp.fileservice;

import com.matiask.lopputyoapp.data.Course;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseFileService {

    public void writeCourseToFile(List<Course> courses) throws IOException {

    // Tallettaa tiedostotyökalulla kurssit tiedostoon
    FileOutputStream f = new FileOutputStream(new File("C:\\temp\\courses.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(courses);
            o.close();
            f.close();
    }

    // Lukee kurssit tiedostosta ja palauttaa oliona
    public List<Course> readCoursesFromFList() {
        List<Course> courses = new ArrayList<>();
        return courses;
    }

}
