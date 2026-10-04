package lab2.task2;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.nanoTime();
    }

    public void start() {
        this.startTime = System.nanoTime();
    }

    public void stop() {
        this.endTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return (this.endTime - this.startTime) / 1_000_000 ;
    }
}
