package com.example.solvd.october14;

import jakarta.xml.bind.annotation.*;

import java.util.Date;
import java.util.List;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    @XmlElement(name = "name")
    private String name;

    @XmlElement(name = "age")
    private int age;

    @XmlElement(name = "enrollmentDate")
    @XmlSchemaType(name = "date")
    private Date enrollmentDate;

    @XmlElementWrapper(name = "subjects")
    @XmlElement(name = "subject")
    private List<String> subjects;

    public Student() {
    }

    public Student(String name, int age, Date enrollmentDate, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.enrollmentDate = enrollmentDate;
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

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
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
                ", enrollmentDate=" + enrollmentDate +
                ", subjects=" + subjects +
                '}';
    }
}
