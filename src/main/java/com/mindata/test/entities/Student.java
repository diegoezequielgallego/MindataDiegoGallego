package com.mindata.test.entities;

import java.util.ArrayList;
import java.util.List;

public final class Student {

   private final String name;

   private final Integer age;

   private final CompletionDate completionDate;

   private final List<Subject> completedSubjects;

   public Student(String name, Integer age, CompletionDate completionDate, List<Subject> completedSubjects) {
      if (name == null || age == null || completionDate == null || completedSubjects == null) {
         throw new IllegalArgumentException("Values cannot be null");
      }
      if (age < 0) {
         throw new IllegalArgumentException("Age cannot be negative");
      }
      this.name = name;
      this.age = age;
      this.completionDate = completionDate;
      this.completedSubjects = new ArrayList<>(completedSubjects);
   }

   public String getName() {
      return name;
   }

   public Integer getAge() {
      return age;
   }

   public CompletionDate getCompletionDate() {
      return new CompletionDate(completionDate.getDay(), completionDate.getMonth());
   }

   public List<Subject> getCompletedSubjects() {
      return new ArrayList<>(completedSubjects);
   }

}
