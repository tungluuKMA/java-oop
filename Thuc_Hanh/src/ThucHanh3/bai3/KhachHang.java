/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3.bai3;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
class KhachHang {
     private String hoTen;
    private String soNha;
    private int maSo;

    public KhachHang(String hoTen, String soNha, int maSo) {
        this.hoTen = hoTen;
        this.soNha = soNha;
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    
    public KhachHang( ) {
        
    }
    public void nhapTT() {
        Scanner input = new Scanner(System.in);
        System.out.println("hoTen : ");
        hoTen = input.nextLine();
        System.out.println("địa chỉ : ");
        soNha = input.nextLine();
        System.out.println("mã số : ");
        maSo = input.nextInt();
        
    }
    
    public void xuatTT() {
        System.out.println("họ và tên : "+hoTen);
        System.out.println("địa chỉ: "+soNha);
        System.out.println("năm sinh : "+maSo);
    }
}
