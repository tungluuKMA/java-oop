/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3.bai2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class SinhVien {
    private String hoTen;
    private String lop;
    private int namSinh;

    public SinhVien(String hoTen, String lop, int namSinh) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public SinhVien(){
        
    }
    public void nhapTT() {
        Scanner input = new Scanner(System.in);
        System.out.println("hoTen : ");
        hoTen = input.nextLine();
        System.out.println("địa chỉ : ");
        lop = input.nextLine();
        System.out.println("năm sinh: ");
        namSinh = input.nextInt();
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : "+hoTen);
        System.out.println("địa chỉ: "+lop);
        System.out.println("năm sinh : "+namSinh);
    }
}
