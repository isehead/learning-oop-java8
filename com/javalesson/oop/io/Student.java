package com.javalesson.oop.io;

import com.javalesson.oop.collections.map.treemap.SubjectGrade;

import java.io.Serializable;
import java.util.Set;

public class Student implements Serializable {

    private String studentName;
    private float averageGrade;
    private Set<SubjectGrade> grades;

    public Student(String studentName, float averageGrade, Set<SubjectGrade> grades) {
        this.studentName = studentName;
        this.averageGrade = averageGrade;
        this.grades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public float getAverageGrade() {
        return averageGrade;
    }

    public Set<SubjectGrade> getGrades() {
        return grades;
    }

 }
