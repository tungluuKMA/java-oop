/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3.bai1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Nguoi {
    
    private String hoTen;
    private String diaChi;
    private int namSinh;

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public Nguoi(){
        
    }

    public void nhapTT() {
        Scanner input = new Scanner(System.in);
        System.out.println("hoTen : ");
        hoTen = input.nextLine();
        System.out.println("địa chỉ : ");
        diaChi = input.nextLine();
        System.out.println("năm sinh: ");
        namSinh = input.nextInt();
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : " + hoTen);
        System.out.println("địa chỉ: " + diaChi);
        System.out.println("năm sinh : " + namSinh);
    }
}
