/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day3;

/**
 *
 * @author LENOVO
 */
class Home {
        public int id,salaryMonthly;
    public String firstName,lastName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(int salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public void showInfor(){
        System.out.println("ID: "+getId());
        System.out.println("firstName: "+getFirstName());
        System.out.println("lastName: "+getLastName());
        System.out.println("Tiền lương: "+getSalaryMonthly());
    }
}
