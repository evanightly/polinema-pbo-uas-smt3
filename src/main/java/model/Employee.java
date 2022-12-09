package model;

public abstract class Employee {

    int id_employee, age, years_experienced;
    String name, username, password;
    float salary;

    public Employee() {

    }

    public Employee(int age, int years_experienced, String name, String username, String password, float salary) { // intended to create data
        this.age = age;
        this.years_experienced = years_experienced;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salary = salary;
    }

    public Employee(int id_employee, String name, String username, String password, int age, float salary, int years_experienced) {
        this.id_employee = id_employee;
        this.age = age;
        this.years_experienced = years_experienced;
        this.name = name;
        this.username = username;
        this.password = password;
        this.salary = salary;
    }

    public abstract boolean login(String username, String password);

    public abstract void logout();

}
