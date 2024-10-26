package com.example.solvd.october28.abstractFactory.banking;

import com.example.solvd.october28.abstractFactory.Developer;
import com.example.solvd.october28.abstractFactory.ProjectManager;
import com.example.solvd.october28.abstractFactory.ProjectTeamFactory;
import com.example.solvd.october28.abstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
