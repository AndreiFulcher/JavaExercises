package Exercício27.services;

import Exercício27.entities.Employee;

public class SalaryService {

    private final TaxService taxService;
    private final PensionService pensionService;

    public SalaryService(TaxService taxService, PensionService pensionService) {
        this.taxService = new TaxService();
        this.pensionService = new PensionService();
    }

    public double netSalary(Employee employee){
        return employee.getGrossSalary() - taxService.tax(employee.getGrossSalary()) - pensionService.discount(employee.getGrossSalary());
    }
}
