package com.example.solvd.september16;

public class ExampleClass {
    private String name;
    private int age;

    public ExampleClass() {
    }

    public ExampleClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(String message) {
        System.out.println("Hello " + message);
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
}
