package chap09.Nomal;

public class Manager extends Employee  {

    private String language;

    public Manager(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public Manager() {

    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String printInfo() {

        return "이름: " + getName() + ", 연봉: " + getSalary() + ", 언어 : " + language;
    }
}
