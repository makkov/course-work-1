package com.hw.maxim;

public class EmployeeBook {

    private Employee[] employees = new Employee[4];

    public void add(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return;
            }
        }
    }

    public void remove(Employee employee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == employee) {
                employees[i] = null;
                return;
            }
        }
    }

    public void printAllEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void printSalarySum() {
        long sum = 0;

        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }

        System.out.println("Суммарная зарплата: " + sum);
    }


    public void printEmployeeWithMinSalary() {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e != null && e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }

        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }

    public void printEmployeeWithMaxSalary() {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e != null && e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }

        System.out.println("Сотрудник с максимально зарплатой: " + employeeWithMaxSalary);
    }

    public void printAverageSalary() {
        long sum = 0;

        for (Employee e : employees) {
            if (e != null) {
                sum += e.getSalary();
            }
        }

        double avgSum = (double) sum / employees.length;

        System.out.println("Средняя зарплата: " + avgSum);
    }

    public void printFullNames() {
        for (Employee e : employees) {
            if (e != null) {
                System.out.println(e.getFullName());
            }
        }
    }
}
