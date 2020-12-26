package lectures.udemy.generics.company;

import lectures.udemy.generics.company.employee.Employee;
import lectures.udemy.generics.company.employee.ItSpecialist;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Department> departments = new ArrayList<>();
    private List<Employee> employees = new ArrayList<>();

    public <T extends Employee> void addDepartment(Department<T> department) {
        departments.add(department);
        List<T> employeeList = department.getEmployees();
        giveRise(employeeList);
        this.employees.addAll(employeeList);
    }

    private void giveRise(List<? extends Employee> employeeList) { // upBound wildCard
        for (Employee employee :
                employeeList) {
            float rise = employee.getSalary() * 0.2f;
            employee.setSalary(employee.getSalary() + rise);
        }
    }

    public void print(List<?> objects){ // unBounded wildCard
        System.out.println(objects);
        System.out.println();
    }

    public void addToItSpecialist(List<? super ItSpecialist> list){

        list.add(new ItSpecialist("Max", 4000));
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "departments=" + departments +
                ", employees=" + employees +
                '}';
    }
}
