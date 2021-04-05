//bai 1: su khac nhau giua class va object
// class co the coi nhu la 1 ban thiet ke con object la 1 thuc the duoc tao ra tu ban thiet ke do

package lab4;

import java.util.*;

public class Employee {
    private int id, basicSalary;
    private String name, dateOfBirth, address, position;
    Scanner input = new Scanner(System.in);

    //constructor
    public Employee(int id, int basicSalary, String name, String dateOfBirth, String address, String position) {
        this.id = id;
        this.basicSalary = basicSalary;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.position = position;
    }

    public Employee() {
    }

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //get data
    public void putData() {
        System.out.println("ID: ");
        id = input.nextInt();
        input.nextLine();
        System.out.println("Name: ");
        name = input.nextLine();
        System.out.println("Data of Birth: ");
        dateOfBirth = input.nextLine();
        System.out.println("Address: ");
        address = input.nextLine();
        System.out.println("Position: ");
        position = input.nextLine();
        System.out.println("Basic salary: ");
        basicSalary = input.nextInt();
    }

    //total salary
    public int salaryCalculator(int extraHours) {
        return basicSalary + extraHours * 100000;
    }

    //show infomation
    @Override
    public String toString() {
        return "Employee [address=" + address + ", basicSalary=" + basicSalary + ", dateOfBirth=" + dateOfBirth
                + ", id=" + id + ", name=" + name + ", position=" + position + "]";
    }

    
}
