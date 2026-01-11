package Exercício27.app;

import Exercício27.entities.Employee;
import Exercício27.services.PensionService;
import Exercício27.services.SalaryService;
import Exercício27.services.TaxService;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter the gross salary: ");
        double grossSalary = sc.nextDouble();

        Employee employee = new Employee(name, grossSalary);

        TaxService taxService = new TaxService();
        PensionService pensionService = new PensionService();
        SalaryService salaryService = new SalaryService(taxService, pensionService);

        double netSalary = salaryService.netSalary(employee);

        System.out.println("Employee: " + employee.getName());
        System.out.printf("Net Salary: %.2f%n", netSalary);
    }
}
