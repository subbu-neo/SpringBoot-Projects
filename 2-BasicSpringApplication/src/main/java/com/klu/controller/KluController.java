package com.klu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class KluController {
 
 @RequestMapping("/laptops")
 public String laptops()
 {
  return "laptops";
 }
 @RequestMapping("/mobiles")
 public String mobiles()
 {
  return "mobiles";
 }
}

