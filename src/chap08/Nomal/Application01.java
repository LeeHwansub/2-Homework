package chap08.Nomal;

public class Application01 {

    public static void main(String[] args) {

Employee employee =new Employee("김직원",5000);
        System.out.println(employee.priceInfo());
Manager manager = new Manager("박매니저", 7000, "인사부");
        System.out.println(manager.priceInfo());

    }
}
