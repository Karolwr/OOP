package model;

public class Employee {
    public String name;
    public String lastname;
    public String PESEL;
    public String birh_date;
    public String empl_date;
    public double salary_net;

    public Employee(String name, String lastname, String PESEL, String birh_date, String empl_date, double salary_net) {
        this.name = name;
        this.lastname = lastname;
        this.PESEL = PESEL;
        this.birh_date = birh_date;
        this.empl_date = empl_date;
        this.salary_net = salary_net;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", PESEL='" + PESEL + '\'' +
                ", birh_date='" + birh_date + '\'' +
                ", empl_date='" + empl_date + '\'' +
                ", salary_net=" + salary_net +
                '}';
    }
}
