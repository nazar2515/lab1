package com.company;

public class Main {
    public static void main(String[] args) {
        BreakThread breakThread = new BreakThread();

        // Створення і запуск основних потоків
        for (int i = 1; i <= 5; i++) { // Змініть кількість потоків тут
            new MainThread(i, breakThread, 1).start(); // 1 - крок послідовності
        }

        // Запуск керуючого потоку
        new Thread(breakThread).start();
    }
}