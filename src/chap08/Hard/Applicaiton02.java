package chap08.Hard;

public class Applicaiton02 {

    public static void main(String[] args) {

        Worker[] workers = new Worker[2];
        workers[0] = new Developer();
        workers[1] = new Designer();

        for (Worker worker : workers) {
            worker.work();
        }

    }

}