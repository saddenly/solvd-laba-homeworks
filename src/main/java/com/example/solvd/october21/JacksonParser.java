package com.example.solvd.october21;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JacksonParser {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            File jsonFile = new File("src/main/java/com/example/solvd/october21/students.json");
            Students students = mapper.readValue(jsonFile, Students.class);

            System.out.println(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
