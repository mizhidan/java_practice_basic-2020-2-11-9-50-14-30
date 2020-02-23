package com.thoughtworks;

import java.text.ParseException;

public class App {

  public static void main(String[] args) throws ParseException {
    Student student = new Student("张三","001","2019.02.11");
    System.out.println(student);
  }
}
