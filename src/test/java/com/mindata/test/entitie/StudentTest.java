package com.mindata.test.entitie;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindata.test.entities.CompletionDate;
import com.mindata.test.entities.Student;
import com.mindata.test.entities.Subject;

@SpringBootTest
public class StudentTest {

   @Autowired
   private StudentService studentService;

   @Test
   public void testStudentCreation() {

      CompletionDate completionDate = new CompletionDate("08", "April");
      List<Subject> subjects = new ArrayList<>();
      subjects.add(new Subject("Mathematics", 9));

      Student student = new Student("Diego", 20, completionDate, subjects);
      Assertions.assertEquals("Diego", student.getName());
      Assertions.assertEquals(20, student.getAge());
      Assertions.assertEquals("08", student.getCompletionDate().getDay());
      Assertions.assertEquals("April", student.getCompletionDate().getMonth());
      Assertions.assertEquals("Mathematics", student.getCompletedSubjects().get(0).getName());
      Assertions.assertEquals(9, student.getCompletedSubjects().get(0).getResult());
   }

   @Test
   public void testStudentCreationWithNullValues() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> new Student(null, 20, new CompletionDate("08", "April"), new ArrayList<>()));
      Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("Diego", null, new CompletionDate("08", "April"), new ArrayList<>()));
      Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("Diego", 20, null, new ArrayList<>()));
      Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("Diego", 20, new CompletionDate("08", "April"), null));
   }

   @Test
   public void testStudentCreationWithNegativeAge() {
      Assertions.assertThrows(IllegalArgumentException.class, () -> new Student("Diego", -1, new CompletionDate("08", "April"), new ArrayList<>()));
   }

}
