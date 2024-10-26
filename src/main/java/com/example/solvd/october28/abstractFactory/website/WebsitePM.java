package com.example.solvd.october28.abstractFactory.website;

import com.example.solvd.october28.abstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages project...");
    }
}
