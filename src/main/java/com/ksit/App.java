package com.ksit;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        Student[] students = {
            new Student("Raghu",    92),
            new Student("Priya",    78),
            new Student("Kiran",    61),
            new Student("Meghana",  45),
            new Student("Suresh",   38),
        };

        System.out.println(StringUtils.repeat("=", 40));
        System.out.println("  KSIT Student Grade Report");
        System.out.println(StringUtils.repeat("=", 40));

        for (Student s : students) {
            System.out.printf("  %-10s | Marks: %3d | %s%n",
                s.getName(), s.getMarks(), s.getGrade());
        }

        System.out.println(StringUtils.repeat("=", 40));
    }
}
