package thread_quiz;

class Stopwatch extends Thread {
    private boolean stop; // stop flag

    @Override
    public void run() {
        while (!stop) {
            // 무한 실행
        }
        // 실행 종료
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}
