package com.company;

public class MainThread extends Thread {
    private final int id;
    private final BreakThread breakThread;
    private final int step;

    public MainThread(int id, BreakThread breakThread, int step) {
        this.id = id;
        this.breakThread = breakThread;
        this.step = step;
    }

    @Override
    public void run() {
        long sum = 0;
        int count = 0;
        boolean isStop = false;
        int currentValue = 0;

        do {
            sum += currentValue;
            currentValue += step;
            count++;
            isStop = breakThread.isCanBreak();
        } while (!isStop);

        System.out.println("Thread " + id + ": sum = " + sum + ", count = " + count);
    }
}
