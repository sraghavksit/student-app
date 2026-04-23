package com.ksit;
import junit.framework.TestCase;

public class AppTest extends TestCase {
    public void testGradeDistinction() {
        Student s = new Student("Test", 92);
        assertEquals("Distinction", s.getGrade());
    }
    public void testGradeFail() {
        Student s = new Student("Test", 35);
        assertEquals("Fail", s.getGrade());
    }
}