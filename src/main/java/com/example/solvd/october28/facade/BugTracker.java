package com.example.solvd.october28.facade;

public class BugTracker {
    private boolean activeSprint;

    public boolean isActiveSprint() {
        return activeSprint;
    }

    public void startSprint() {
        System.out.println("Starting sprint");
        activeSprint = true;
    }

    public void stopSprint() {
        System.out.println("Stopping sprint");
        activeSprint = false;
    }
}
