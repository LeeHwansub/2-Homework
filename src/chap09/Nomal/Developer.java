package chap09.Nomal;

public class Developer extends Employee {

    private String department;

    public Developer() {

    }



    public Developer(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    @Override
    public String printInfo() {
        return super.printInfo() + ", 부서: " + department;
    }
}