package com.example.solvd.october14;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class JAXBParser {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Students.class);

            Unmarshaller unmarshaller = context.createUnmarshaller();

            File xmlFile = new File("src/main/java/com/example/solvd/october14/students.xml");
            Students students = (Students) unmarshaller.unmarshal(xmlFile);

            System.out.println(students);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
