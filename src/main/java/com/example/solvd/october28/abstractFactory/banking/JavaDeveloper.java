package com.example.solvd.october28.abstractFactory.banking;

import com.example.solvd.october28.abstractFactory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer writes Java code...");
    }
}
