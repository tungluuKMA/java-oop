/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String args[]) {
        ArrayList<NhanSu> arrNS = new ArrayList<>();
        int n;
        NhanSu NS;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nhan vien: ");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++){
            System.out.println("Nhap nhan vien thu " + (i+1) +": ");
            NS = new NhanSu();
            NS.nhapThongTin();
            arrNS.add(NS);
        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");
        }   
        for (int i = 0; i < arrNS.size(); i++){
            System.out.println("\nNhan vien thu " + (i+1) +": ");
            arrNS.get(i).inThongTin();
        }
        }
}
