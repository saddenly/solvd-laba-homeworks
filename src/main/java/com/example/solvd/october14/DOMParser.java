package com.example.solvd.october14;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("src/main/java/com/example/solvd/october14/students.xml");

            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            System.out.println("Root element: " + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("student");

            for (int i = 0; i < nList.getLength(); i++) {
                Node nNode = nList.item(i);
                System.out.println("Element: " + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nNode;

                    String name = element.getElementsByTagName("name").item(0).getTextContent();
                    System.out.println("Name: " + name);

                    String age = element.getElementsByTagName("age").item(0).getTextContent();
                    System.out.println("Age: " + age);

                    String enrollmentDate = element.getElementsByTagName("enrollmentDate").item(0).getTextContent();
                    System.out.println("Enrollment Date: " + enrollmentDate);

                    NodeList subjectsList = element.getElementsByTagName("subject");
                    System.out.println("Subjects: ");
                    for (int j = 0; j < subjectsList.getLength(); j++) {
                        System.out.println(subjectsList.item(j).getTextContent() + " ");
                    }
                    System.out.println();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
