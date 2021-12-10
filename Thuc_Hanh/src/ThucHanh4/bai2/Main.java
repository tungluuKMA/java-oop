/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh4.bai2;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Diem d1 = new Diem(3, 7);
        Diem d2 = new Diem(9, 3);
        double a = d1.getX()-d2.getX();
        double b = d1.getX()-d2.getY();
        double d = Math.sqrt( a * a + b * b );
        System.out.println("khoảng cách giữa 2 điểm : "+d);
    }
}
