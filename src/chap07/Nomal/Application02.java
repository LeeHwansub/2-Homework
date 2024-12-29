package chap07.Nomal;

public class Application02 {

    public static void main(String[] args) {

        Athlete[] athlete = new Athlete[3];
        athlete[0] = new Athlete("선수1", 10);
        athlete[1] = new Athlete("선수2", 20);
        athlete[2] = new Athlete("선수3", 15);

        int max = athlete[0].record;

        for (int i = 0; i < 3; i++) {
            if (athlete[i].record > max) {
                max = athlete[i].record;
            }

        }
        System.out.println("최고 기록 : " + max);
    }
}