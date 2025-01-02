package chap12.easy;

import java.util.LinkedList;

public class Application02 {

    public static void main(String[] args) {

        LinkedList<String> LinkedList = new LinkedList<>();

        LinkedList.add("A");
        LinkedList.add("B");
        LinkedList.add("C");
        LinkedList.add("D");
        LinkedList.add("E");

        System.out.println("첫 번째 요소 : " + LinkedList.getFirst());
        System.out.println("마지막 요소 : " + LinkedList.getLast());

    }
}
