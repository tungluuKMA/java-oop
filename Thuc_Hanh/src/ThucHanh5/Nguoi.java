/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh5;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class Nguoi {
     String hoTen;
    String diaChi;
    String namSinh;

    public Nguoi() {
        super();
    }

    public Nguoi(String hoTen, String diaChi, String namSinh) {
        super();
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapThongTin() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoTen = input.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = input.nextLine();
        System.out.println("Nhap nam sinh: ");
        namSinh = input.nextLine();
    }

    public void inThongTin() {
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Dia chi: " + diaChi);
        System.out.println("Nam sinh: " + namSinh);
    }
}
