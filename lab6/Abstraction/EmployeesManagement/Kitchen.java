package lab6.Abstraction.EmployeesManagement;

public class Kitchen extends Employee {
    
    private int serviceCharge;

    public Kitchen(int id, int age, int basicSalary, String name, int serviceCharge) {
        super(id, age, basicSalary, name);
        this.serviceCharge = serviceCharge;
    }

    public Kitchen() {
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    @Override
    public int calculatorSalary() {
        return serviceCharge + getBasicSalary();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " - " + serviceCharge + " - " + calculatorSalary();
    }
}
