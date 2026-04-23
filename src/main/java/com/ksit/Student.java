package com.ksit;

public class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName()  { return name; }
    public int    getMarks() { return marks; }

    public String getGrade() {
        if (marks >= 90) return "Distinction";
        if (marks >= 75) return "First Class";
        if (marks >= 60) return "Second Class";
        if (marks >= 40) return "Pass";
        return "Fail";
    }
}