package com.thoughtworks;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Student {
    private String name;
    private String id;
    private SimpleDateFormat enrollDate;

    public Student(String name,String id,String enrollDate) {
        this.name = name;
        this.id = id;
        this.enrollDate = new SimpleDateFormat(enrollDate);
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

    public SimpleDateFormat getEnrollDate() {
        return enrollDate;
    }

    public void setEnrollDate(String enrollDate) {
        this.enrollDate = new SimpleDateFormat(enrollDate);
    }

    public Boolean isEquals(Student o) {
        return(this.id.equals(o.id));
    }
}
