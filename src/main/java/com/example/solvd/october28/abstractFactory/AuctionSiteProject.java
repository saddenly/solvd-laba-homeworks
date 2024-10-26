package com.example.solvd.october28.abstractFactory;

import com.example.solvd.october28.abstractFactory.website.WebsiteTeamFactory;

public class AuctionSiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager pm = projectTeamFactory.getProjectManager();

        System.out.println("Creating auction website...");
        developer.writeCode();
        tester.testCode();
        pm.manageProject();
    }
}
