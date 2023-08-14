package com.mindata.test.entitie;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mindata.test.dto.StudentDTO;
import com.mindata.test.entities.CompletionDate;
import com.mindata.test.entities.Student;
import com.mindata.test.entities.Subject;

@Service
public class StudentService {

   public Student createStudnet(StudentDTO studentDTO) {
      CompletionDate completionDate = new CompletionDate(studentDTO.getCompletionDay(), studentDTO.getCompletionMonth());
      List<Subject> subjectList = new ArrayList<>();
      studentDTO.getSubjects().forEach((name, score) -> subjectList.add(new Subject(name, score)));
      Student student = new Student(studentDTO.getName(), studentDTO.getAge(), completionDate, subjectList);
      System.out.println("Name: " + student.getName());
      System.out.println("Age: " + student.getAge());
      System.out.println("Completion Date: " + student.getCompletionDate().getDay() + " " + student.getCompletionDate().getMonth());
      student.getCompletedSubjects().forEach(subject -> System.out.println("Subject: " + subject.getName() + ", Score: " + subject.getResult()));

      return student;
   }

}
