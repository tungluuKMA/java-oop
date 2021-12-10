/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap_th2;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */

/*Viết chương trình tìm các số nguyên tố nhỏ hơn một số n cho trước
 a. Chỉ sử dụng chu trình for
 b. Chỉ sử dụng chu trình while
 c. Chỉ sử dụng chu trình do-while
*/
public class bai4 {
    public static boolean isPrime(int m) {
        for (int i = 2; i <= Math.sqrt(m); i++) {
            if (m % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter n: ");
        n = input.nextInt();
        System.out.println("prime numbers less than n: ");
        for (int j = 2; j <= n; j++) {
            if (isPrime(j)) {
                System.out.println(j);
            }
        }
}
    
  /*public static boolean isPrime(int m) {
        int i = 2;
        while (i <= Math.sqrt(m)) {
            if (m % i++ == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = input.nextInt();
        System.out.println("prime numbers less than m: ");
        int j = 2;
        while (j <= m) {
            if (isPrime(j++)) {
                System.out.println(j - 1);
            }
        }
    }*/
/*  public static boolean isPrime(int m) {
        int i = 1;
        if (m == 2) {
            return true;
        }
        do {
            if (m % ++i == 0) {
                return false;
            }
        } while ((i) <= Math.sqrt(m));
        return true;
    }
    public static void main(String[] args) {
        int m;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap m: ");
        m = input.nextInt();
        System.out.println("prime numbers less than m: ");
        int j = 2;
        while (j <= m) {
            if (isPrime(j++)) {
                System.out.println(j - 1);
            }
        }
    }*/
}
