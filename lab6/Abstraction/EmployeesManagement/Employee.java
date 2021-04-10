package lab6.Abstraction.EmployeesManagement;

public abstract class Employee implements IEmployee {
    
    private int id, age, basicSalary;
    private String name;

    public Employee(int id, int age, int basicSalary, String name) {
        this.id = id;
        this.age = age;
        this.basicSalary = basicSalary;
        this.name = name;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        this.age = age;
    }



    public int getBasicSalary() {
        return basicSalary;
    }



    public void setBasicSalary(int basicSalary) {
        this.basicSalary = basicSalary;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public abstract int calculatorSalary();

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + basicSalary;
    }

    

}
