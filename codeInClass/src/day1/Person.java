/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class Person {
    private String hoTen;
    private String soCMND;
    private String queQuan;
     
    public Person() {
        super();
    }
     
    public Person(String hoTen, String queQuan, String soCMND) {
        super();
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.soCMND = soCMND;
    }
     
    public String getSoCMND() {
        return soCMND;
    }
    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }
     
    public void nhapThongTinKhachTro() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập họ tên khách hàng: ");
        hoTen = input.nextLine();
        System.out.print("Nhập quê quán: ");
        queQuan = input.nextLine();
        System.out.print("Nhập số chứng minh nhân dân: ");
        soCMND = input.nextLine();
    }
     
    public void hienThiThongTinKhachTro() {
        System.out.println("Họ và tên khách hàng: " + hoTen);
        System.out.println("Quê quán: " + queQuan);
        System.out.println("Số chứng minh nhân dân: " + soCMND);
    }
}
