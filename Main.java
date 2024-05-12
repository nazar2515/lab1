class CalculateSumThread extends Thread {
    private int threadId;

    public CalculateSumThread(int threadId) {
        this.threadId = threadId;
    }

    public void run() {
        int step = 2; // Крок послідовності
        int sum = 0;
        int elementsCount = 0;

        for (int i = 0; i <= threadId * 100; i += step) {
            sum += i;
            elementsCount++;
        }

        System.out.println("Thread " + (threadId + 1) + ": Sum = " + sum + ", Elements Count = " + elementsCount);
    }
}

public class Main {
    static int totalThreads = 5; // Змінюйте це значення, щоб змінювати кількість потоків

    public static void main(String[] args) {
        for (int i = 0; i < totalThreads; i++) {
            new CalculateSumThread(i).start();
        }
    }
}