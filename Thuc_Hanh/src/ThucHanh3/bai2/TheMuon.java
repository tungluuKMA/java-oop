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
public class TheMuon extends SinhVien{
    private String soPhieu;
    private String soHieusach;

    public TheMuon(){
        
    }
    public TheMuon(String soPhieu, String soHieusach, String hoTen, String lop, int namSinh) {
        super(hoTen, lop, namSinh);
        this.soPhieu = soPhieu;
        this.soHieusach = soHieusach;
    }

    public String getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(String soPhieu) {
        this.soPhieu = soPhieu;
    }

    public String getSoHieusach() {
        return soHieusach;
    }

    public void setSoHieusach(String soHieusach) {
        this.soHieusach = soHieusach;
    }

    @Override
    public void nhapTT() {
        super.nhapTT();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập số phiểus muợn : ");
        soPhieu = input.nextLine();
        System.out.println("nhập số hiệu sách : ");
        soHieusach  = input.nextLine();
    }
    
    @Override
    public void xuatTT(){
        super.xuatTT();
        System.out.println("số PM: " + soPhieu);
        System.out.println("số hiệu sách : " + soHieusach);
    }

    

    
}