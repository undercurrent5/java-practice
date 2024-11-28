package thread.start.test;

import static util.MyLogger.log;

public class CounterThread extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            log("value: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
