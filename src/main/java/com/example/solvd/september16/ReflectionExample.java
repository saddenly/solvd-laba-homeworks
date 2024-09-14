package com.example.solvd.september16;

import java.lang.reflect.*;
import java.util.logging.Logger;

public class ReflectionExample {
    private static final Logger LOGGER = Logger.getLogger(ReflectionExample.class.getName());

    public static void main(String[] args) {
        try {
            Class<?> clazz = ExampleClass.class;

            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                LOGGER.info("Field: " + field.getName());
                LOGGER.info("\tType: " + field.getType());
                LOGGER.info("\tModifiers: " + Modifier.toString(field.getModifiers()));
            }

            Constructor<?>[] constructors = clazz.getDeclaredConstructors();
            for (Constructor<?> constructor : constructors) {
                LOGGER.info("Constructor: " + constructor.getName());
                LOGGER.info("\tParameter Count: " + constructor.getParameterCount());
                for (Parameter parameter : constructor.getParameters()) {
                    LOGGER.info("\t\tType: " + parameter.getType());
                }
            }

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                LOGGER.info("Method: " + method.getName());
                LOGGER.info("\tReturn Type: " + method.getReturnType());
                LOGGER.info("\tModifiers: " + Modifier.toString(method.getModifiers()));
                LOGGER.info("\tParameter count: " + method.getParameterCount());
                for (Parameter parameter : method.getParameters()) {
                    LOGGER.info("\t\tType: " + parameter.getType());
                }
            }

            Constructor<?> constructor = clazz.getConstructor(String.class, int.class);
            Object sampleObj = constructor.newInstance("John", 25);
            LOGGER.info("Object created using reflection: " + sampleObj.toString());

            Method sayHelloMethod = clazz.getMethod("sayHello", String.class);
            sayHelloMethod.invoke(sampleObj, "Reflection");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
