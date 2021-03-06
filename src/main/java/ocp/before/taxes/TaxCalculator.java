package ocp.before.taxes;


import ocp.before.personnel.Employee;

public class TaxCalculator {
    private final int RETIREMENT_TAX_PERCENTAGE = 10;
    private final int INCOME_TAX_PERCENTAGE = 16;
    private final int BASE_HEALTH_INSURANCE = 100;

    // The main TaxCalculator only perform the tax calculation for the full-time employees
        // There are other times of employees like interns and part-time employees
    public double calculate(Employee employee) {
        return BASE_HEALTH_INSURANCE +
                (employee.getMonthlyIncome() * RETIREMENT_TAX_PERCENTAGE) / 100 +
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;

    }
}
