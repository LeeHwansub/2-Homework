package chap12.nomal;

import java.util.Iterator;
import java.util.TreeSet;

public class Applicaiton02 {

    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(5);
        ts.add(3);
        ts.add(8);
        ts.add(1);
        ts.add(2);

        System.out.println("TreeSet의 요소" + ts);

        Iterator<Integer> iterator = ts.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next() + "");
        }
    }

    }

