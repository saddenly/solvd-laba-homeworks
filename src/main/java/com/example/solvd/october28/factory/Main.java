package com.example.solvd.october28.factory;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("c++");
        Developer developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        return switch (specialty){
            case "java" -> new JavaDeveloperFactory();
            case "c++" -> new CppDeveloperFactory();
            default -> throw new IllegalArgumentException("Invalid specialty");
        };
    }
}
