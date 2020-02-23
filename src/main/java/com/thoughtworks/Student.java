package com.thoughtworks;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String id;
    private String enrollDate;

    public Student(String name,String id,String enrollDate) {
        this.name = name;
        this.id = id;
        this.enrollDate = enrollDate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEnrollDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date enrollDate = dateFormat.parse(this.enrollDate);
        SimpleDateFormat newDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
        return newDateFormat.format(enrollDate);
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = enrollDate;
    }

    public int getInSchoolYear() {
        Date currentTime = new Date();
        String enrollSchoolYear = enrollDate.split("\\.")[0];
        DateFormat currentDate = new SimpleDateFormat("yyyy");
        int inSchoolYear = Integer.parseInt(currentDate.format(currentTime)) - Integer.parseInt(enrollSchoolYear);
        return inSchoolYear;
    }

    public Boolean isEquals(Student o) {
        return(this.id.equals(o.id));
    }

    @Override
    public String toString() {

        try {
            return "我叫" + name + ",我的学号是" + id + "," +getEnrollDate() + "入学，学龄" + getInSchoolYear() + "年";
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "abc";
    }
}
