package com.example.solvd.october28.facade;

public class WorkflowFacade {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}
