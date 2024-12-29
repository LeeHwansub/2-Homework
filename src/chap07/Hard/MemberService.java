package chap07.Hard;

import java.util.Scanner;

public class MemberService {

    public void signUpMembers() {

        Scanner sc = new Scanner(System.in);

        System.out.print("몇 명의 회원을 등록하시겠습니까? ");
        int num = sc.nextInt();

        Member[] members = new Member[num];

        for (int i = 0; i < num; i++) {

            System.out.print("번호: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("아이디: ");
            String userId = sc.nextLine();

            System.out.print("비밀번호: ");
            String pwd = sc.nextLine();

            System.out.print("이름: ");
            String name = sc.nextLine();

            System.out.print("나이: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("성별(M/F): ");
            char gender = sc.nextLine().charAt(0);

            members[i] = new Member(id, userId, pwd, name, age, gender);
        }

        MemberRegister memberRegister = new MemberRegister();

        memberRegister.regist(members);
    }

    public void showAllMembers() {

        MemberFinder finder = new MemberFinder();

        System.out.println("----------- 가입된 회원 목록 -------------");
        for (Member m : finder.findAllMembers()) {

            if (m != null) {
                System.out.println(m.getInformation());
            }
        }
        System.out.println("---------------------------------------");
    }

    public void filterMembers() {

        MemberFinder finder = new MemberFinder();
        Member[] members = finder.findAllMembers();

        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 나이 범위 (예: 20-30): ");
        String range = sc.nextLine();

        String[] tokens = range.split("-");

        int minAge = Integer.parseInt(tokens[0]);
        int maxAge = Integer.parseInt(tokens[1]);

        System.out.println("----------- 조건에 맞는 회원 목록 -------------");
        for (Member m : members) {

            if (m != null
                    && m.getAge() >= minAge
                    && m.getAge() <= maxAge) {
                System.out.println(m.getInformation());
            }
        }
        System.out.println("---------------------------------------");
    }

    public void showStatistics() {

        MemberFinder finder = new MemberFinder();
        Member[] members = finder.findAllMembers();

        int totalAge = 0;
        int count = 0;
        int maleCount = 0;
        int femaleCount = 0;

        for (Member m : members) {

            if (m != null) {

                totalAge += m.getAge();
                count++;

                if (m.getGender() == 'M') {
                    maleCount++;
                } else if (m.getGender() == 'F') {
                    femaleCount++;
                }
            }
        }

        double averageAge = count > 0 ? (double) totalAge / count : 0;

        System.out.println("평균 나이: " + averageAge);
        System.out.println("남성 회원 수: " + maleCount);
        System.out.println("여성 회원 수: " + femaleCount);
    }
}