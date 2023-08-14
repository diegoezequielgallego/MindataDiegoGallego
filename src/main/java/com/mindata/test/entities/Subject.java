package com.mindata.test.entities;

public final class Subject {

   private final String name;

   private final int result;

   public Subject(String name, int result) {
      if (name == null) {
         throw new IllegalArgumentException("Subject name cannot be null");
      }
      if (result < 0 || result > 10) {
         throw new IllegalArgumentException("Result must be between 0 and 10");
      }
      this.name = name;
      this.result = result;
   }

   public String getName() {
      return name;
   }

   public int getResult() {
      return result;
   }

}
