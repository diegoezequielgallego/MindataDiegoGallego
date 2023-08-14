package com.mindata.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindata.test.dto.StudentDTO;
import com.mindata.test.entitie.StudentService;

@RestController
public class StudentController {

   @Autowired
   private StudentService studentService;

   @PostMapping
   public void createConfirmedTrx(@RequestBody @Validated StudentDTO studentDTO) {
      studentService.createStudnet(studentDTO);
   }

}
