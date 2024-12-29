package chap08.Nomal;

public class Manager extends Employee {

    String department;

    public Manager(String name, int salary, String department) {
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
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }


    @Override
    public String priceInfo() {
        return super.priceInfo()+
                "Manager{" +
                "department='" + department + '\'' +
                '}';
    }



}
