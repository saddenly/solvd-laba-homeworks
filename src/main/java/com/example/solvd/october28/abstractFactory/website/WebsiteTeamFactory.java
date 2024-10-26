package com.example.solvd.october28.abstractFactory.website;

import com.example.solvd.october28.abstractFactory.Developer;
import com.example.solvd.october28.abstractFactory.ProjectManager;
import com.example.solvd.october28.abstractFactory.ProjectTeamFactory;
import com.example.solvd.october28.abstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
