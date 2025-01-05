package chap09.Nomal;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        // Employee 생성
        Employee employee = new Employee();
        System.out.print("이름을 입력하시오: ");
        employee.setName(sc.nextLine());
        System.out.print("연봉을 입력하시오: ");
        employee.setSalary(sc.nextInt());
        sc.nextLine(); // 버퍼 비우기

        // Developer 생성
        Developer developer = new Developer();
        developer.setName(employee.getName());
        developer.setSalary(employee.getSalary());
        System.out.print("부서를 입력하시오: ");
        developer.setDepartment(sc.nextLine());

        // Manager 생성
        Manager manager = new Manager();
        manager.setName(employee.getName());
        manager.setSalary(employee.getSalary());
        System.out.print("언어를 입력하시오: ");
        manager.setLanguage(sc.nextLine());

        // 출력
        System.out.println("\nEmployee");
        System.out.println(employee.printInfo());
        System.out.println("\nDeveloper");
        System.out.println(developer.printInfo());
        System.out.println("\nManager");
        System.out.println(manager.printInfo());

        sc.close();
    }
}