package com.thoughtworks;

import java.util.ArrayList;

public class Teacher {
    private String name;
    private ArrayList<Student> stuList;
    private ArrayList<Student> repStuList = new ArrayList<>();

    public Teacher() {

    }

    public Teacher(String name, ArrayList<Student> stuList) {
        this.name = name;
        this.stuList = stuList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStuList() {
        return stuList;
    }

    public void setStuList(ArrayList<Student> stuList) {
        this.stuList = stuList;
    }

    public ArrayList<Student> showRepStuInfo() {
        for(int i = 0 ; i < stuList.size(); ++i) {
            for (int j = i + 1 ; j < stuList.size(); ++j ) {
                if(stuList.get(i).isEquals(stuList.get(j))) {
                    repStuList.add(stuList.get(i));
                    repStuList.add(stuList.get(j));
                }
            }
        }
        return repStuList;
    }
}
