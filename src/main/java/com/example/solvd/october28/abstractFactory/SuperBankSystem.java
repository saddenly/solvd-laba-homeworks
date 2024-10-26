package com.example.solvd.october28.abstractFactory;

import com.example.solvd.october28.abstractFactory.banking.BankingTeamFactory;

public class SuperBankSystem {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getProjectManager();

        System.out.println("Creating bank system...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
