package chap07.Nomal;

public class Application01 {

    public static void main(String[] args) {

        Employee[] arr = new Employee[3];

        arr[0] = new Employee("직원1",3000);
        arr[1] = new Employee("직원2",4000);
        arr[2] = new Employee("직원3",5000);

        int total = 0;
        for(int i=0; i< arr.length; i++){
     total += arr[i].salaryl; }

    double avg = total/arr.length;
        System.out.println("평균 급여 : " + avg);
    }
}
