package com.hw.maxim;

public class Employee {

    private int id;

    private String fullName;

    private int department;

    private long salary;

    private static int idCounter = 0;

    public Employee(String fullName, int department, long salary) {
        this.id = idCounter;
        idCounter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public long getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (getId() != employee.getId()) return false;
        if (getDepartment() != employee.getDepartment()) return false;
        if (getSalary() != employee.getSalary()) return false;
        return getFullName() != null ? getFullName().equals(employee.getFullName()) : employee.getFullName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId();
        result = 31 * result + (getFullName() != null ? getFullName().hashCode() : 0);
        result = 31 * result + getDepartment();
        result = 31 * result + (int) (getSalary() ^ (getSalary() >>> 32));
        return result;
    }
}
