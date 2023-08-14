package com.mindata.test.entities;

public final class CompletionDate {

   private final String day;

   private final String month;

   public CompletionDate(String day, String month) {
      if (day == null || month == null) {
         throw new IllegalArgumentException("Values cannot be null");
      }
      this.day = day;
      this.month = month;
   }

   public String getDay() {
      return day;
   }

   public String getMonth() {
      return month;
   }

}
