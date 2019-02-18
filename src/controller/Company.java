package controller;

import model.Employee;

public class Company {
    Employee employee[] = new Employee[10];
    int index = 0;

    public void addEmployee(
            String name,
            String lastname,
            String PESEL,
            String birh_date,
            String empl_date,
            double salary_net) {
// utorzenie obiektu pracownika
        Employee e = new Employee(name, lastname, PESEL, birh_date, empl_date, salary_net);
        
// zapisanie pracownika do listy pracownikow

        employee[index] = e;

        // inkrementacja index-u
        index++;

//wyswietlenie danych zapisanego pracownika

        System.out.println("Dodano pracownika: " + e);
    }

    public void getAllEmployees() {
        for (int i = 0; i < index; i++) {
            System.out.println(employee[i]);
        }
    }

    public static void main(String[] args) {
        Company c = new Company();
        c.addEmployee("M", "K", "22222222", "2000-12-11", "2000-12-13", 10000);
        c.addEmployee("D", "S", "44444444", "2005-12-11", "2005-12-13", 12000);
        c.addEmployee("G", "E", "55555555", "2004-12-11", "2012-12-13", 13000);

        c.getAllEmployees();
    }
}

