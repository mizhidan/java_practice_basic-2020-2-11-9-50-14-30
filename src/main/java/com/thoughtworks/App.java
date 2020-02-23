package com.thoughtworks;

import java.text.ParseException;
import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    Student threeZhang = new Student("张三","001","2019.02.11");
    Student fourLi = new Student("李四","002","2019.02.10");
    Student fiveWang = new Student("王五","001","2019.02.09");
    System.out.println(threeZhang.isEquals(fiveWang));
    System.out.println(threeZhang);
    ArrayList<Student> studentArrayList = new ArrayList<>();
    studentArrayList.add(threeZhang);
    studentArrayList.add(fourLi);
    studentArrayList.add(fiveWang);
    Teacher dragonZhang = new Teacher("张龙",studentArrayList);
    ArrayList<Student> repStuInfo = dragonZhang.showRepStuInfo();
    System.out.println("repetition info:");
    for(Student value : repStuInfo) {
      System.out.println(value);
    }
  }
}
