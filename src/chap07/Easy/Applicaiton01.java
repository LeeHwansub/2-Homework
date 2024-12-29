package chap07.Easy;

public class Applicaiton01 {

    public static void main(String[] args) {
        Student[] A = new Student[3];
        A[0] = new Student("학생1",90);
        A[1] = new Student("학생2",80);
        A[2] = new Student("학생3",70);

        for (Student student : A){
            System.out.println("이름:" + student.name + ", 점수 : " + student.score);
        }


    }
}
