package org.example.Streamemp2;

public class Employee2 {
    int id;
    String name;
    String gread;
    int salary;

    public Employee2(int id, String name, String gread, int salary) {
        this.id = id;
        this.name = name;
        this.gread = gread;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGread() {
        return gread;
    }

    public void setGread(String gread) {
        this.gread = gread;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gread='" + gread + '\'' +
                ", salary=" + salary +
                '}';
    }
}
