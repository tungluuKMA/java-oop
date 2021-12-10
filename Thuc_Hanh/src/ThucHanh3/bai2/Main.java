/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3.bai2;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<TheMuon> t1 = new ArrayList<>();
        TheMuon tc = new TheMuon();
        tc.nhapTT();
        t1.add(tc);
        System.out.println("================");
        for (int i = 0; i < t1.size(); i++) {
            t1.get(i).xuatTT();
            
        }
    }
}
