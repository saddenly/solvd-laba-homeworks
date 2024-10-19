package com.example.solvd.october21;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Student {

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("enrollmentDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date enrollementDate;

    @JsonProperty("subjects")
    List<String> subjects;

    public Student() {
    }

    public Student(String name, int age, Date enrollementDate, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.enrollementDate = enrollementDate;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getEnrollementDate() {
        return enrollementDate;
    }

    public void setEnrollementDate(Date enrollementDate) {
        this.enrollementDate = enrollementDate;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", enrollementDate=" + enrollementDate +
                ", subjects=" + subjects +
                '}';
    }
}
