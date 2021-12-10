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
public class Person {
    private String name;
    private int yob;
    private String address;

    public Person(String name, int yob, String address) {
        this.name = name;
        this.yob = yob;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", yob=" + yob + ", address=" + address + '}';
    }
    
    public void showInfor(){
        System.out.println("name=" + name + ", yob=" + yob + ", address=" + address + '}');
    }
}