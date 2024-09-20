package com.example.solvd.september23;

public class Task implements Runnable {
    private String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(taskName + " is executing: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.err.println(e.getMessage());
            }
        }
        System.out.println(taskName + " is finished");
    }
}
