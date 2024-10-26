package com.example.solvd.october28.abstractFactory.website;

import com.example.solvd.october28.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Php Developer writes php code...");
    }
}
