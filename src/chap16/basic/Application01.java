package chap16.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application01 {

    public static void main(String[] args) {

        int [] Arr = {10,20,30,40,50};
        Arrays.stream(Arr).forEach(System.out :: println);


    }
}
