package com.example.solvd.october28.abstractFactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
