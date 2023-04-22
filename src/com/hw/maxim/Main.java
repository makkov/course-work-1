package com.hw.maxim;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[4];
        Employee employee1 = new Employee("Ivanov Ivanov", 1, 58005);
        Employee employee2 = new Employee("Petr Petrov", 2, 52006);
        Employee employee3 = new Employee("Ivan Petrov", 3, 60000);
        Employee employee4 = new Employee("Petr Ivanov", 4, 56000);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;

        System.out.println("Получить список всех сотрудников со всеми имеющимися по ним данными");
        printAllEmployees(employees);

        System.out.println("Сумма затрат на зарплаты в месяц");
        printSalarySum(employees);

        System.out.println("Найти сотрудника с минимальной зарплатой");
        printEmployeeWithMinSalary(employees);

        System.out.println("Найти сотрудника с максимальной зарплатой");
        printEmployeeWithMaxSalary(employees);

        System.out.println("Подсчитать среднее значение зарплат");
        printAverageSalary(employees);

        System.out.println("Получить Ф. И. О. всех сотрудников");
        printFullNames(employees);
    }

    private static void printAllEmployees(Employee[] employees) {
        for (Employee e: employees) {
            System.out.println(e);
        }
    }

    private static void printSalarySum(Employee[] employees) {
        long sum = 0;

        for (Employee e : employees) {
            sum += e.getSalary();
        }

        System.out.println("Суммарная зарплата: " + sum);
    }

    private static void printEmployeeWithMinSalary(Employee[] employees) {
        Employee employeeWithMinSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() < employeeWithMinSalary.getSalary()) {
                employeeWithMinSalary = e;
            }
        }

        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);
    }

    private static void printEmployeeWithMaxSalary(Employee[] employees) {
        Employee employeeWithMaxSalary = employees[0];
        for (Employee e : employees) {
            if (e.getSalary() > employeeWithMaxSalary.getSalary()) {
                employeeWithMaxSalary = e;
            }
        }

        System.out.println("Сотрудник с максимально зарплатой: " + employeeWithMaxSalary);
    }

    private static void printAverageSalary(Employee[] employees) {
        long sum = 0;

        for (Employee e : employees) {
            sum += e.getSalary();
        }

        double avgSum = (double) sum / employees.length;

        System.out.println("Средняя зарплата: " + avgSum);
    }

    private static void printFullNames(Employee[] employees) {
        for (Employee e : employees) {
            System.out.println(e.getFullName());
        }
    }
}
