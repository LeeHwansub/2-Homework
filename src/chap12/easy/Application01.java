package chap12.easy;

import java.util.ArrayList;
import java.util.Collections;

public class Application01 {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(1);
        arr.add(2);

        Collections.sort(arr);

        System.out.println("정렬된 리스트 : " + arr);

    }
}
