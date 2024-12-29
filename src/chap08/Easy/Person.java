package chap08.Easy;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected void selfIntroduction() {
        System.out.println("이름 : " + name + " 나이 : " + 20  );
    }

}
