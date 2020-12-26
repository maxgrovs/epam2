package lectures.udemy.generics.company;

import lectures.udemy.generics.company.employee.Accountant;
import lectures.udemy.generics.company.employee.ItSpecialist;
import lectures.udemy.generics.company.employee.Manager;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company();

        Department<Accountant> accounting = new Department<>("Accounting", 4);
        Department<Manager> management = new Department<>("Senya", 2);
        Department<ItSpecialist> itGuys = new Department<>("Accounting", 6);

        Accountant accountant = new Accountant("Alex", 1000);
        ItSpecialist itSpecialist = new ItSpecialist("Fedya", 4000);
        Manager manager = new Manager("Max", 5000);

        accounting.addEmployee(accountant);
        itGuys.addEmployee(itSpecialist);

        company.addDepartment(accounting);
        company.addDepartment(itGuys);
        company.addDepartment(management);

        //System.out.println(company);

        company.print(company.getDepartments());
        company.print(company.getEmployees());

        company.addToItSpecialist(itGuys.getEmployees());
        company.addToItSpecialist(company.getEmployees());
    }
}
