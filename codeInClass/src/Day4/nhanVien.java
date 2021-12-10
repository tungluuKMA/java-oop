/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class nhanVien {
    public String name,address;
    public int yob;
    public double wage;
    public int hours;

    public nhanVien(String name, String address, int yob, double wage, int hours) {
        this.name = name;
        this.address = address;
        this.yob = yob;
        this.wage = wage;
        this.hours = hours;
    }
    
    public nhanVien() {
        this.name = "Khải";
        this.address = "Nam Định";
        this.yob = 2001;
        this.wage = 2000;
        this.hours = 200;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    public void addInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên : ");
        name=sc.nextLine();
        System.out.println("nhập địa chỉ: ");
        address=sc.nextLine();
        System.out.println("nhập năm sinh: ");
        yob=Integer.parseInt(sc.nextLine());
        System.out.println("nhập lương: ");
        wage=sc.nextDouble();
        System.out.println("nhập số giờ làm: ");
        hours=sc.nextInt();
    }
    
    public void printInfor() {
        System.out.println("Tên: "+name+" Địa chỉ: "+address+" năm sinh: "+yob+" Lương: "+wage+" Giờ làm: "+ hours);
    }

    @Override
    public String toString() {
        return "nhanVien{" + "name=" + name + ", address=" + address + ", yob=" + yob + ", wage=" + wage + ", hours=" + hours + '}';
    }
    
    public double tienThuong() {
        if(hours >= 200){
            return  wage*20/100;
        }
        if(hours>=100 && hours <200){
            return wage*10/100;
        }
        else 
            return 0;
    }
}
