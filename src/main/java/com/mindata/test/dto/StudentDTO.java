package com.mindata.test.dto;

import java.util.HashMap;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class StudentDTO {

   private String name;

   private int age;

   private String completionDay;

   private String completionMonth;

   private Map<String, Integer> subjects = new HashMap<>();

}
