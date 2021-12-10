/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Day4;

/**
 *
 * @author LENOVO
 */
public class SoNguyenTo {
    public int a;

    public SoNguyenTo() {

    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public SoNguyenTo(int x) {
        if (isPrime(x)) {
            this.a = x;
        } else {
            System.out.println("X khong la so nguyen to");
        }
    }

    public int nextPrime() {
        while (!isPrime(++this.a)) {
        }
        return a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (isPrime(a)) {
            this.a = a;
        } else {
            System.out.println("Khong set");
        }
    }

    public static void main(String[] args) {
        SoNguyenTo sn1 = new SoNguyenTo();
        sn1.setA(5);
        System.out.println("so nguyen to tiep theo:" + sn1.nextPrime());

        SoNguyenTo sn2 = new SoNguyenTo(4);
        sn2.setA(4);
    }
}
