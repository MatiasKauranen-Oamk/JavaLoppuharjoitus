package com.matiask.lopputyoapp.fileservice;

import com.matiask.lopputyoapp.data.Student;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentFileService {

    public void writeStudentsToFile(List<Student> students) throws IOException {
        
    // Tallettaa tiedostotyökalulla opiskelijat tiedostoon
    FileOutputStream f = new FileOutputStream(new File("C:\\temp\\students.txt"));
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(students);
            o.close();
            f.close();     
    }

    // Lukee opiskelijat tiedostosta ja palauttaa oliona
    public List<Student> readStudentsFromFList() {
        List<Student> students = new ArrayList<>();
        return students;
        
        
    }

}
