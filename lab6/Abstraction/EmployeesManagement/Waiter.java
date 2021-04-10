package lab6.Abstraction.EmployeesManagement;

public class Waiter extends Employee {
    
    private int compensate;

    public Waiter(int id, int age, int basicSalary, String name, int compensate) {
        super(id, age, basicSalary, name);
        this.compensate = compensate;
    }

    public Waiter() {
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public int calculatorSalary() {
        return compensate + getBasicSalary();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + compensate + " - " + calculatorSalary();
    }
}
