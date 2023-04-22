package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Ivanov Ivanov", 1, 58005);
        Employee employee2 = new Employee("Petr Petrov", 2, 52006);
        Employee employee3 = new Employee("Ivan Petrov", 3, 60000);
        Employee employee4 = new Employee("Petr Ivanov", 4, 56000);


        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.add(employee1);
        employeeBook.add(employee2);
        employeeBook.add(employee3);
        employeeBook.add(employee4);
        employeeBook.printAllEmployees();

        System.out.println();
        employeeBook.remove(employee3);
        employeeBook.printAllEmployees();

        System.out.println();
        employeeBook.printSalarySum();

        System.out.println();
        employeeBook.printAverageSalary();
    }
}
