package com.example.solvd.september23;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task("runnable 1"));
        Thread thread2 = new Thread(new Task("runnable 2"));

        thread1.start();
        thread2.start();

        CallableTask callableTask = new CallableTask("callable task");
        FutureTask<Integer> futureTask = new FutureTask<>(callableTask);
        Thread callableThread = new Thread(futureTask);
        callableThread.start();

        try {
            thread2.join();
            thread1.join();
            callableThread.join();

            Integer result = futureTask.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("Main finished");
    }
}
