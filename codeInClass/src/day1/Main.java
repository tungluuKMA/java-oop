/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n;  // số khách trọ
        khachSan khachSan;
         
        // tạo 1 ArrayList lưu thông tin khách trọ
       ArrayList<khachSan> arrKhachSan = new ArrayList<>();
         
        System.out.println("Nhập số lượng khách trọ: ");
        n = Integer.parseInt(input.nextLine());
         
        for (int i = 0; i < n; i++) {
            khachSan = new khachSan();
            System.out.println("Nhập thông tin khách hàng thứ " + (i+1) + ":");
            khachSan.nhapThongTinCanQuanLy();
            arrKhachSan.add(khachSan);
        }
         
        // hiển thị danh sách khách trọ
        for (int i = 0; i < arrKhachSan.size(); i++) {
            System.out.println("\nThông tin khách hàng thứ " + (i+1) + ": ");
            arrKhachSan.get(i).hienThiThongTinCanQuanLy();
        }
         
        // tính tiền phòng khi khách hàng trả phòng
        System.out.println("\nNhập số chứng minh nhân dân của khách trả phòng: ");
        String tim = input.nextLine();
        for (int i = 0; i < arrKhachSan.size(); i++) {
            if (arrKhachSan.get(i).getNguoi().getSoCMND().equalsIgnoreCase(tim)) {
                System.out.println("Số tiền phòng = " + arrKhachSan.get(i).tinhTien());
            }
        }
    }
    }
    
}
