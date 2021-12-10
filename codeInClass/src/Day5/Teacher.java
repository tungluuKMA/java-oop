/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day5;

/**
 *
 * @author LENOVO
 */

public class Teacher extends Person{
    private String tcode;
    private double salary;
    
    public Teacher(String name, int yob, String address) {
        super(name, yob, address);
    }

    public String getTcode() {
        return tcode;
    }

    public void setTcode(String tcode) {
        this.tcode = tcode;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    @Override
    public void showInfor(){
        super.showInfor();
        System.out.println("tcode: "+getTcode());
        System.out.println("salary: "+getSalary());
    }
}