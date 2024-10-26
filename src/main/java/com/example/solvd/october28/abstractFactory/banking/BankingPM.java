package com.example.solvd.october28.abstractFactory.banking;

import com.example.solvd.october28.abstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {

    @Override
    public void manageProject() {
        System.out.println("Banking PM manages project...");
    }
}
