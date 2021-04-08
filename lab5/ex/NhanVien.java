package lab5.ex;

import java.util.*;

public class NhanVien {
    private int id, age, salary, phoneNumber ;
    private String name, email;
    Scanner sc = new Scanner(System.in);
    
    public NhanVien(int id, int age, int salary, int phoneNumber, String name, String email) {
        this.id = id;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.email = email;
    }

    public NhanVien() {
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void input() {
        System.out.print("Nhap id: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap SDT: ");
        phoneNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
        System.out.print("Nhap luong co ban: ");
        salary = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + " - " + name + " - " + age + " - " + phoneNumber + " - " + email + " - " + salary;
    }
}
