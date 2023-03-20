package entities;

public class Employee {
    
    private String name;
    private Double salary;

    //Construtores
    public Employee(){}

    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}