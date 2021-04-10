package lab6.Interface.EmployeeManagement;

public abstract class Employee implements IEmployee {
    
    private String name;
    private int workingHour;
    
    public Employee(String name, int workingHour) {
        this.name = name;
        this.workingHour = workingHour;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

}
