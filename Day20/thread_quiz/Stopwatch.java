package thread_quiz;

class Stopwatch extends Thread {
    private boolean stop; // stop flag

    @Override
    public void run() {
        while (!stop) {
            // ���� ����
        }
        // ���� ����
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
