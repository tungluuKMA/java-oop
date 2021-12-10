/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3.bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<BienLai> BL = new ArrayList<>();
        System.out.println("nhập số lượng hóa đơn: ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("nhập hóa đơn số "+ (i+1));
            BienLai b1 = new BienLai();
            b1.nhapTT();
            BL.add(b1);
        }
        for (int i = 0; i < BL.size(); i++) {
            BL.get(i).xuatTT();
            
        }
    }
}
