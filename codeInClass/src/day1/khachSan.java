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
class khachSan {
    private int soNgayTro;
    private String loaiPhong;
    private double giaPhong;
    private Person nguoi;    
    public khachSan() {
        super();
    }
    public khachSan(int soNgayTro, String loaiPhong, double giaPhong, Person nguoi) {
        super();
        this.soNgayTro = soNgayTro;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
        this.nguoi = nguoi;
    }
     
    public Person getNguoi() {
        return nguoi;
    }
    public void setNguoi(Person nguoi) {
        this.nguoi = nguoi;
    }
    public void nhapThongTinCanQuanLy() {
        Scanner input = new Scanner(System.in);
         
        // nhập thông tin khách trọ
        nguoi = new Person();
        nguoi.nhapThongTinKhachTro();
         
        System.out.print("Nhập số ngày trọ: ");
        soNgayTro = Integer.parseInt(input.nextLine());
        System.out.print("Nhập loại phòng: ");
        loaiPhong = input.nextLine();
        System.out.print("Nhập giá phòng: ");
        giaPhong = input.nextDouble();
    }
     
    public void hienThiThongTinCanQuanLy() {
        nguoi.hienThiThongTinKhachTro();
        System.out.println("Số ngày trọ: " + soNgayTro);
        System.out.println("Loại phòng: " + loaiPhong);
        System.out.println("Giá phòng: " + giaPhong);
    }
    public double tinhTien() {
        return soNgayTro * giaPhong;
    }
}
