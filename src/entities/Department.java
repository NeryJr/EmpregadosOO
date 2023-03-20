package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
    
    private String name;
    private Integer payday;

    private Adress adress;
    List<Employee> employees = new ArrayList<>();

    //Construtores
    public Department (){}

    public Department(String name, Integer payday, Adress adress) {
        this.name = name;
        this.payday = payday;
        this.adress = adress;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPayday() {
        return payday;
    }

    public void setPayday(Integer payday) {
        this.payday = payday;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Employee> getEmployee() {
        return employees;
    }

    //Métodos
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }

    public double payroll(){
        double sum = 0.0;
        for (Employee employeeList : employees) {
            sum += employeeList.getSalary();
        }
        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Employee employee : employees) {
            sb.append(employee.getName() + "\n");
        }
        return sb.toString();
    }
}