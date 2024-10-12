package com.example.solvd.october14;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;

public class XMLValidator {
    public static void main(String[] args) {
        File xmlFile = new File("src/main/java/com/example/solvd/october14/students.xml");
        File xsdFile = new File("src/main/java/com/example/solvd/october14/students.xsd");

        if (validateXMLSchema(xsdFile, xmlFile))
            System.out.println("XML is valid");
        else
            System.out.println("XML is invalid");
    }

    private static boolean validateXMLSchema(File xsdFile, File xmlFile) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

            Schema schema = factory.newSchema(xsdFile);

            Validator validator = schema.newValidator();

            validator.validate(new StreamSource(xmlFile));
            return true;
        } catch (IOException | SAXException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
