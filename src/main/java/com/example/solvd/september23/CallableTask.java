package com.example.solvd.september23;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<Integer> {
    private String taskName;

    public CallableTask(String name) {
        this.taskName = name;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println(taskName + " is calculating sum: " + sum);
            Thread.sleep(1000);
        }
        System.out.println(taskName + " is finished");
        return sum;
    }
}
