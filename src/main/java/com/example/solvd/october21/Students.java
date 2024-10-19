package com.example.solvd.october21;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Students {

    @JsonProperty("students")
    private List<Student> students;

    public Students() {
    }

    public Students(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Students{" +
                "students=" + students +
                '}';
    }
}
